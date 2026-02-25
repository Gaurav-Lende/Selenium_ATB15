package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium_005 {
    public static void main(String[] args) {
        ChromeDriver driver2 = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver = new FirefoxDriver();
        driver = new SafariDriver();
    }
}
