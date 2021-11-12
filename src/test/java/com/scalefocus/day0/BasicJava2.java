package com.scalefocus.day0;

public class BasicJava2 {

    public static void main(String[] args) {

        Integer i1 = new Integer(10);

        int i2 = 20;

        Integer i3 = 30;

        int i4 = i1;

        String s = "100";
        int neo = Integer.parseInt(s);
        System.out.println(neo*8);

        Integer number = 10;
        System.out.println("String.valueOf(number).concat(\" Eren\") = " + String.valueOf(number).concat(" Eren"));
        System.out.println("Character.isDigit(1) = " + Character.isDigit('1'));
        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));
        System.out.println("Character.isAlphabetic('8') = " + Character.isAlphabetic('8'));
        System.out.println("Character.isLetter('g') = " + Character.isLetter('g'));
        System.out.println("Character.isLetter('9') = " + Character.isLetter('9'));


    }

}
