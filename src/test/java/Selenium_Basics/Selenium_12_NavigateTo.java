package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_12_NavigateTo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://uat-pargro.finfluxtrial.io/sign-in?redirectURL=%2Fcustomers%2F180%2Floan-accounts%2F62");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
