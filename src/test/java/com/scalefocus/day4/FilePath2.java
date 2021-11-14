package com.scalefocus.day4;

import org.testng.annotations.Test;

public class FilePath2 {

    @Test
    public void test1(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        String path = System.getProperty("user.dir");
        System.out.println("path = " + path);
    }

}
