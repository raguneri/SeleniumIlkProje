package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ragun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com");

        // navigate().back() komutu bir önceki sayfaya geri dönmeye yarıyor.
        webDriver.navigate().back();

        // navigate().forward() methodu geri geldiğimiz sayfaya gitmemizi sağlıyor
        // örnek : google -> amazona gittik -> amazondan google'a geri geldik
        // eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();

        // navigate().refresh() methodu sayfayı yenilemeye yarıyor.
        webDriver.navigate().refresh();

        webDriver.manage().window().maximize();
    }

}
