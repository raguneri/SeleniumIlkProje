package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ragun\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://youtube.com");
        String sayfaBasligi = webDriver.getTitle();  // Car

        if(sayfaBasligi.toLowerCase().contains("video")){
            System.out.println("video kelimesi geçiyor : " + sayfaBasligi);
        }else{
            System.out.println("video kelimesi geçmiyor." + sayfaBasligi);
        }
        webDriver.quit();
    }
}
