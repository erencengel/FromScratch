package com.scalefocus.day0;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BasicJava1 {



    public static void main(String[] args) {
        String name = "Alperen";
        String [] strArray = name.split("l");
        System.out.println("strArray.length = " + strArray.length);
        System.out.println("strArray[0] = " + strArray[0]);
        System.out.println("strArray[1] = " + strArray[1]);

        int [] array1 = {0,1,2,3,4,5};
        System.out.println("array1.length = " + array1.length);
        int [] array2 = new int[7];
        String [] array3 = new String[10];
        System.out.println("array3[0] = " + array3[0]);
        array2[0] = 1;
        array2[1] = 50;
        System.out.println("Arrays.toString(array2) = " + Arrays.toString(array2));


        String [][] array2D = {{"eren","alperen", "şerife"}, {"zeynep", "fethi"}, {"almila"}};
        System.out.println("array2D[0][2] = " + array2D[0][2]);

        Random random = new Random();
        int ranNumber = random.nextInt(100)+100;
        System.out.println("ranNumber = " + ranNumber);

        Boolean ranBool = random.nextBoolean();
        System.out.println("ranBool = " + ranBool);



    }

}
