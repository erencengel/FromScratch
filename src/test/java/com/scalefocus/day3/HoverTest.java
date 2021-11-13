package com.scalefocus.day3;

import com.scalefocus.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://practice.cybertekschool.com/hovers");
        driver.findElement(By.cssSelector("button#details-button")).click();
        driver.findElement(By.cssSelector("a#proceed-link")).click();
        WebElement element = driver.findElement(By.xpath("//a[.='Home']"));
        webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        WebElement element1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        actions = new Actions(driver);
        actions.moveToElement(element1).perform();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
    }

    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".qual_x_svg_dash")).click();
        driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("div#draggable"));
        WebElement drag = elements.get(0);
        List<WebElement> elements1 = driver.findElements(By.xpath(".k-header"));
        WebElement droptarget = elements1.get(0);
        actions = new Actions(driver);
        actions.dragAndDrop(drag,droptarget).perform();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

    }

}
