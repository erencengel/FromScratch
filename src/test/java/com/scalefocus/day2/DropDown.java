package com.scalefocus.day2;

import com.utilities.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {

    WebDriver driver;
    Select select;

    @Test
    public void test1(){
        driver = WebDriverInstance.getDriver("chrome-headless");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement element = driver.findElement(By.cssSelector("select#month"));
        select = new Select(element);
//        System.out.println(select.getFirstSelectedOption().getText());
//        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//        for (WebElement allSelectedOption : allSelectedOptions) {
//            System.out.println(allSelectedOption.getText());
//        }
//        List<WebElement> options = select.getOptions();
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//        }

        select.selectByIndex(6);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("December");
        System.out.println(select.getFirstSelectedOption().getText());

    }

}
