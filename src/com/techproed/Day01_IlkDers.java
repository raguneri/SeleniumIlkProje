package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ragun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");
        //driverımızda açık olan pencereyi kapatır.
        //webDriver.close();
        webDriver.quit();

            }
}
