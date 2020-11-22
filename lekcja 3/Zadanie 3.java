package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int[][] array = new int[5][5];
        int[] min = new int[5];
        int[] max = new int[5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(11) - 5;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            min[i] = Arrays.stream(array[i]).min().getAsInt();
            max[i] = Arrays.stream(array[i]).max().getAsInt();
        }
        System.out.println("Minimum: ");
        printArray(min);
        System.out.println();
        System.out.println("Maximum: ");
        printArray(max);

        int diagMax = Integer.MIN_VALUE;
        int diagMin = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    if (array[i][j] > diagMax) diagMax = array[i][j];
                }
                if (i + j == array.length - 1) {
                    if (array[i][j] < diagMin) diagMin = array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Maksimum na 1. przekątnej: " + diagMax);
        System.out.println("Minimum na 2. przekątnej: " + diagMin);

    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }


}
