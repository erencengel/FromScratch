package com.scalefocus.day2;

import com.utilities.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtons {

    WebDriver driver;

    @Test
    public void test1(){
        driver = WebDriverInstance.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement element = driver.findElement(By.cssSelector("#blue"));
        Assert.assertTrue(element.isSelected());
        driver.quit();

    }

}
