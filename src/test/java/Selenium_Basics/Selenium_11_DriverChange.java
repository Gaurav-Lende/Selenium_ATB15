package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_11_DriverChange {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver1 = new ChromeDriver();
        driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://uat-pargro.finfluxtrial.io/sign-in?redirectURL=%2Fcustomers%2F180%2Floan-accounts%2F62");
        driver1.wait(2000);
        driver1.quit();
    }
}
