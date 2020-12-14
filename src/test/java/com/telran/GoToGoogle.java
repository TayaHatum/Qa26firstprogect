package com.telran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoToGoogle {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();

    }


    @Test
    public void gotoGoogle() throws InterruptedException {
        wd.get("https://google.com");
        Thread.sleep(300);

    }



    @AfterMethod
    public void tearDown(){
        wd.quit();
    }




}
