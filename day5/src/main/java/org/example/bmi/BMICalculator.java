package org.example.bmi;


/**
 * 비만지수 계산기
 */
public class BMICalculator {

    public static double calc(double height, double weight) {
        double result = 0.0;
        result = weight /( height * height );
        return result;
    }
}
