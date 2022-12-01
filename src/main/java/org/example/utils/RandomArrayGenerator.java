package org.example.utils;

import java.util.Random;

public class RandomArrayGenerator {
    public static int[] createRandomIntArray(int size, int range) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(range);
        }

        return arr;
    }
}
