package org.example;

import java.util.Random;

public class NumberGenerater {
    public static int Generater() {
        Random rand = new Random();
        return rand.nextInt(45)+1;

    }
}
