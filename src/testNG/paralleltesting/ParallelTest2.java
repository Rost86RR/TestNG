package testNG.paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {

    WebDriver driver;

    @Test
    void loginTest() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }

}
