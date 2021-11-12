package com.scalefocus.day0;

import java.util.ArrayList;

public class CarWork {

    public static void main(String[] args) {
        Car car = new Car("BMW", "Sedan", 2, 60000);
        System.out.println("car.toString() = " + car.toString());
        System.out.println(car.toString());

        boolean bool = car instanceof Car;
        System.out.println("bool = " + bool);


        int [] array = {0,1,2};

        ArrayList<Integer> arrayList = new ArrayList();
        for(int i=0;i<=10;i++){
            arrayList.add(i);
        }

        System.out.println(arrayList.toString());

        arrayList.add(11);
        System.out.println(arrayList);

        System.out.println(arrayList.get(8));
        



    }

}
