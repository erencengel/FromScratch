package com.scalefocus.day2;

import com.utilities.WebDriverInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alerts {

    WebDriver driver;
    WebDriverWait webDriverWait;
    Alert alert;

    @Test
    public void test1(){
        driver = WebDriverInstance.getDriver("chrome-headless");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        WebElement visibleElement = driver.findElement(By.xpath("//h3[starts-with(text(),'Java')]"));
        webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.visibilityOf(visibleElement));
        driver.findElement(By.cssSelector("button[onclick^='jsA']")).click();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        alert = driver.switchTo().alert();
        alert.accept();

    }



}
