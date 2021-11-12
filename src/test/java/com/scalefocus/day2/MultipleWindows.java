package com.scalefocus.day2;

import com.utilities.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverInstance.getDriver("chrome-headless");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        String currentWindow = driver.getWindowHandle();
        driver.findElement(By.cssSelector("a[target^='_b'][href^='/']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(currentWindow)){
                driver.switchTo().window(windowHandle);
            }
        }
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/windows");
        String currentHandle = driver.getWindowHandle();
        driver.findElement(By.cssSelector("a[target^='_b'][href^='/']")).click();
        String targetUrl = "http://practice.cybertekschool.com/windows/new";
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if(driver.getCurrentUrl().equals(targetUrl)){
                break;
            }
        }
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }

}
