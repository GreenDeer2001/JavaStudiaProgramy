package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] variables = new int[10];
        int above = 0;
        int below = 0;
        Random r = new Random();

        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < variable.length; i++) {
            variable[i] = r.nextInt(21) - 10;
            System.out.print(variable[i] + " ");
        }
        System.out.println();
        int min = Arrays.stream(variables).min().getAsInt();
        int max = Arrays.stream(variables).max().getAsInt();

        double ave = Arrays.stream(variables).average().getAsDouble();

        System.out.println("Srednia: " + ave);
        System.out.println("Min :" + min + ", " + "max: " + max);

        for (int i = 0; i < variable.length; i++) {
            if (variables[i] < ave) {
                below++;
            } else if (variables[i] > ave) {
                above++;
            }
        }
        System.out.println("Miejsze od sr: " + below);
        System.out.println("Większe od sr: " + above);

        System.out.println("Liczby w odwoconej kolejnosci:");
        reverse(variables);
    }

    public static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
