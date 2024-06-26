package testNG.paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");

    }

    @Test
    void homePageTitle() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }
}
