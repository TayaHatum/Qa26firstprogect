package com.telran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HowToSerch {

    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd= new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void serchtest(){

        wd.get("https://en.wikipedia.org/wiki/English_Wikipedia");
        wd.findElement(By.id("pt-login")).click();

    }


    @AfterClass
    public void tearDown(){
       wd.quit();
    }
}
