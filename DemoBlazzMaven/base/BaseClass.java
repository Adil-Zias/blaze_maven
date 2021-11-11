package com.DemoBlazzMaven.base;

import com.DemoBlazzMaven.util.Common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    String chromePath = "D:\\src\\DemoBlazz_Maven\\src\\test\\resources\\drivers\\chromedriver.exe";
    String URL = "https://www.demoblaze.com/index.html";
    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void ending(){
        Common.waitSecond(1);
        driver.quit();

    }
}
