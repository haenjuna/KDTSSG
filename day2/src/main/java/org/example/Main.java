package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[6];

        arr[0] = NumberGenerater.Generater();
        arr[1] = NumberGenerater.Generater();
        arr[2] = NumberGenerater.Generater();
        arr[3] = NumberGenerater.Generater();
        arr[4] = NumberGenerater.Generater();
        arr[5] = NumberGenerater.Generater();

        System.out.println(Arrays.toString(arr));
    }
}