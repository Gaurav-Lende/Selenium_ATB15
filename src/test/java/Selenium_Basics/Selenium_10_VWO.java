package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_10_VWO {

    @Test
    public void test_selenium_02(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        driver.quit();
    }
}
