package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_13 {
    @Test
    //Driver
    public void test_vwo_com () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
    //Locators
        WebElement Username = driver.findElement(By.id("login-username"));
        Username.sendKeys("gaurav@gmail.com");

        WebElement Password = driver.findElement(By.id("login-password"));
        Password.sendKeys("Gaurav@123");

        WebElement Button = driver.findElement(By.id("js-login-btn"));
        Button.click();

        Thread.sleep(5000);

        WebElement Error_Msg = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(Error_Msg.getText());

        Assert.assertEquals(Error_Msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }

}
