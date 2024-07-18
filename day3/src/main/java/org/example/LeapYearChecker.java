package org.example;

public class LeapYearChecker {
    public static void main(String[] args) {
        //4로 나눈 나머지가 0이면 윤년
        //4,100으로 나눈 나머지가 0이면 평년
        //4,100,400으로 나눈 나머지가 0이면 윤년
        int year =2000;
        boolean isLeapYear = false;

        if(year%400 == 0){
            isLeapYear = true;
        }else if(year%100 == 0){
            isLeapYear = false;
        }else if(year%4==0){
            isLeapYear =true;
        }
    }
}
