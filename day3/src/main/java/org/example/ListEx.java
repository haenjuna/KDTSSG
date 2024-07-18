package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        System.out.println(list);
        System.out.println("size: "+ list.size());

        for (int i = 0; i < 6; i++) {
            System.out.println(list.remove(0));
        }
//        list.add(1,100);
//        list.set(2,100);
//        System.out.println(list);
       }
}
