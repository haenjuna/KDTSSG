package org.example;

import java.util.Arrays;

public class ForEx1 {
    public static void main(String[] args) {

        LottoBall[] balls = new LottoBall[45];
        for (int i = 0; i < 45; i++) {
            balls[i] = new LottoBall(i+1);
        }
        System.out.println(Arrays.toString(balls));
//        int[] arr = new int[45];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i+1;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
