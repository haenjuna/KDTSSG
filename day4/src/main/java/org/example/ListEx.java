package org.example;

import java.util.ArrayList;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(1,100);
        list.set(2,100);
        System.out.println(list);
    }
}
