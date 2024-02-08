import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class AssertionsExample {

    WebDriver driver;
    @BeforeClass
    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 1)
    void logoTest()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
    }

    @Test(priority = 2)
    void homePageTitle()
    {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "The title is not matched");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
