package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 체중과 신장 입력 받기
        System.out.print("체중(kg)을 입력하세요: ");
        double weight = sc.nextDouble();
        System.out.print("신장(cm) 입력하세요: ");
        double height = sc.nextDouble();
        height = height /100.0;
        //계산하기
        double Bmi = BmiCalculater.calculateBMI(weight,height);

        //판별
        if(Bmi < 20){
            System.out.printf("당신의 BMI 지수는 %.2f 이므로 저체중입니다.\n", Bmi);
        } else if (Bmi<25) {
            System.out.printf("당신의 BMI 지수는 %.2f 이므로 정상입니다.\n", Bmi);
        } else if (Bmi<30) {
            System.out.printf("당신의 BMI 지수는 %.2f 이므로 과체중입니다.\n", Bmi);
        } else{
            System.out.printf("당신의 BMI 지수는 %.2f 이므로 비만입니다.\n", Bmi);
        }

        sc.close();
    }
}