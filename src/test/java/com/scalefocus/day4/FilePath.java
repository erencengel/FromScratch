package com.scalefocus.day4;

import com.scalefocus.TestBase;
import org.testng.annotations.Test;

public class FilePath {

    @Test
    public void test1(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
        String path = System.getProperty("user.dir");
        String secondPath = "src/test/resources/text.txt";
        String fullPath = path + "/" + secondPath;
        System.out.println(fullPath);
    }

}
