package com.scalefocus.day0;

public class Car {

    String name;
    String model;
    int age;
    int price;

    public Car(String name, String model, int age, int salary){
        this.name = name;
        this.model = model;
        this.age = age;
        price = salary;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    static String [] str = {"eren", "alperen"};
}
