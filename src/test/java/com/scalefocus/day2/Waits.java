package com.scalefocus.day2;

import com.scalefocus.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Waits extends TestBase {

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement element = driver.findElement(By.cssSelector("div#start>button"));
        element.click();
        webDriverWait.until
                (ExpectedConditions.visibilityOf
                        (driver.findElement(By.xpath("//h3[contains(text(),'Dynamically')]"))));
        String expectedResult = "Dynamically Loaded Page Elements";
        String actualResult = driver.findElement(By.xpath("//h3[contains(text(),'Dynamically')]")).getText();
        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
