package com.scalefocus.day4;

import com.scalefocus.TestBase;
import com.utilities.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Webtables {

    WebDriver driver;
    Map<String, Integer> map = new HashMap<>();

    @BeforeMethod
    public void setUp() {
        driver = WebDriverInstance.getDriver("chrome");
        driver.get("https://practice.cybertekschool.com/tables");
        driver.findElement(By.cssSelector("button#details-button")).click();
        driver.findElement(By.cssSelector("a#proceed-link")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public int getColumnNumberInOneShot() {
        List<WebElement> elements = driver.findElements(By.cssSelector("table#table1 thead tr th"));
        return elements.size();
    }

    public int getRowNumberInOneShot() {
        List<WebElement> elements = driver.findElements(By.cssSelector("table#table1 tbody  tr"));
        return elements.size();
    }

    public String getSpecialBucket(int a, int b) {
        WebElement target = driver.findElement
                (By.xpath("//table[@id='table1']/tbody/tr[" + a + "]/td[" + b + "]"));
        return target.getText();
    }

    public void askedQuestion() {
        for(int i=1;i<=getRowNumberInOneShot();i++){
            for(int j=1;j<=getColumnNumberInOneShot();j++){
                WebElement target = driver.findElement
                        (By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]"));
                System.out.println(target.getText());
            }
        }


    }

    @Test
    public void test1(){
        System.out.println("getSpecialBucket(3,5) = " + getSpecialBucket(3, 5));
    }

    @Test
    public void test2(){
        askedQuestion();
    }

}
