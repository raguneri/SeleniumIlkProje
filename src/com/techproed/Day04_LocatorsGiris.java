package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ragun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
        // webelementimizi id kullanarak bulduk.
        WebElement signInLink = driver.findElement(By.id("sign-in"));
// webelementimize tıkladık.
        signInLink.click();
//email kutusunu bulalım.
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
// emailKutusu'nun içerisine yazı gönderiyoruz
        emailKutusu.sendKeys("testtechproed@gmail.com");
//sifre kutusunu buluyor.
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
// sifreKutusu'nun içerisine yazı gönderiyoruz
        sifreKutusu.sendKeys("Test1234!");
// sign in butonunu buluyoruz. // name="commit"
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

    }
}
