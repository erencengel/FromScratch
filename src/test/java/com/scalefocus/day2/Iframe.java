package com.scalefocus.day2;

import com.scalefocus.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//a[.='Cybertek School']")).click();
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        WebElement elem = driver.findElement(By.cssSelector("frame[name*=top]"));
        driver.switchTo().frame(elem);
        WebElement element = driver.findElement(By.cssSelector("frame[name*=left]"));
        driver.switchTo().frame(element);
        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'L')]")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'B')]")).getText());
        driver.switchTo().defaultContent();


    }

}
