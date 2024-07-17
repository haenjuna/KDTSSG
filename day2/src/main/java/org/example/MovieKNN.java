package org.example;

import java.util.Arrays;

public class MovieKNN {
    public static void main(String[] args) {

//        //키스씬의 숫자 배열
//        int[] kissCountArr = {2,8,10,3,6};
//        //액션씬의 숫자 배열
//        int[] actionCountArr = {12,3,2,12,10};
//
//        String[] Kindarr = {"A","R","R","A","A"};
//
//        System.out.println(Arrays.toString(kissCountArr));
//        System.out.println(Arrays.toString(actionCountArr));

//        int[][] arr = {{2,12},{8,3},{10,2},{3,12},{6,10}};
//
//        Movie m1 = new Movie();
//        m1.title = "Harry poter";
//        m1. actionCount = 10;
//        m1.kissCount = 2;
//        m1.kind ="A";
//
//        System.out.println(m1);
        Movie m1 = new Movie();
        m1.title = "범죄도시";
        m1.actionCount = 12;
        m1.kissCount = 2;
        m1.kind = "A";

        Movie m2 = new Movie();
        m2.title = "라라랜드";
        m2.actionCount = 3;
        m2.kissCount = 8;
        m2.kind = "R";

        Movie m3 = new Movie();
        m3.title = "냉정과 열정사이";
        m3.actionCount = 2;
        m3.kissCount = 10;
        m3.kind = "R";

        Movie m4 = new Movie();
        m4.title = "매드맥스";
        m4.actionCount = 3;
        m4.kissCount = 12;
        m4.kind = "A";

        Movie m5 = new Movie();
        m5.title = "쥬라기월드";
        m5.actionCount = 10;
        m5.kissCount = 6;
        m5.kind = "A";


        Movie[] movies = new Movie[] { m1, m2, m3, m4, m5 };
        System.out.println(Arrays.toString(movies));
    }
}
