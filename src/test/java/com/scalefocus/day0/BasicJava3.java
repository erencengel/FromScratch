package com.scalefocus.day0;

import java.util.ArrayList;
import java.util.List;

public class BasicJava3 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
        System.out.println(arrayList.toString());

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);

        arrayList.addAll(list);

        System.out.println(arrayList.toString());



    }

}
