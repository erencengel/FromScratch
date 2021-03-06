package com.scalefocus;

import com.utilities.WebDriverInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    protected Actions actions;
    protected JavascriptExecutor javascriptExecutor;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverInstance.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver,10);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
