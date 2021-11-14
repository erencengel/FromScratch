package com.scalefocus.day3;

import com.scalefocus.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Jse extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.amazon.com/ref=nav_logo");
        javascriptExecutor = (JavascriptExecutor) driver;
        WebElement all = driver.findElement(By.xpath("(//div[@class='nav-left'])[3]"));
        //javascriptExecutor.executeScript("arguments[0].click();",all);
        all.click();
        Thread.sleep(5000);
        WebElement music = driver.findElement(By.cssSelector("a[data-ref-tag='nav_em_1_1_1_2']"));
        //music.click();
        javascriptExecutor.executeScript("arguments[0].click();",music);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException interruptedException){
            System.out.println("coming from catch block");
            interruptedException.printStackTrace();
            interruptedException.getMessage();
        }

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/");
        WebElement draganddrop = driver.findElement(By.cssSelector("a[href^='/dro']"));
        javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();",draganddrop);
        Thread.sleep(5000);
    }

    @Test
    public void test3(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        javascriptExecutor = (JavascriptExecutor) driver;
       // while (true){
         //   javascriptExecutor.executeScript("window.scrollBy(0,250)");
        //}
    }

}
