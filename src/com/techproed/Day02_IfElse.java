package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ragun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://amazon.com");
        String sayfaBasligi = webDriver.getTitle();  // Car
// contains methodu, bir yazının içerisinde bir kelime grubunun geçip geçmediğini kontrol eder.
        if(sayfaBasligi.toLowerCase().contains("books")){
            System.out.println("books kelimesi geçiyor : " + sayfaBasligi);
        }else{
            System.out.println("books kelimesi geçmiyor." + sayfaBasligi);
        }
        webDriver.quit();
    }
}
