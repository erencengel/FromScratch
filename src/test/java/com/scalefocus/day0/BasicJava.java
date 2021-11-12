package com.scalefocus.day0;

public class BasicJava {

    public static void main(String[] args) {

        String name = "Alperen";

        if(name.contains("Alp")){
            System.out.println("I got the name");
        }else {
            System.out.println("Where is the name?");
        }

        System.out.println(arithmetic(5,10,'+'));
        System.out.println(arithmetic(5,10,'-'));
        System.out.println(arithmetic(5,10,'*'));
        System.out.println(arithmetic(50,10,'/'));
        System.out.println(arithmetic(50,10,'^'));



    }

    public static int arithmetic (int a,int b,char c){ ;
        switch (c){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                System.out.println("Invalid operator");
                return -1;
        }
    }

}
