package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_001 {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
    }
}
