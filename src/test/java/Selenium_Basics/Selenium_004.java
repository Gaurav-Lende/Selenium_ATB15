package Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_004 {
    public static void main(String[] args) {
        //Selenium 3 -
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
    }
}
