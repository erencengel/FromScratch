package com.scalefocus.day4;

import com.scalefocus.TestBase2;
import org.testng.annotations.Test;

public class DriverIntro extends TestBase2 {

    @Test
    public void test1(){
        driver.get("https://www.amazon.com/");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
    }


}
