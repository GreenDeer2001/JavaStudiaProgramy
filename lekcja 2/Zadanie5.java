package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int sum = 0;
        int min = 0;
        int max = 0;
        int numbers = 0;


        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        while ((num = sn.nextInt()) != 0) {
            if (numbers == 0) {
                min = num;
                max = num;
            }

            if (num < min) min = num;
            if (num > max) max = num;
            numbers++;
            sum += num;
            System.out.println("Podaj kolejna liczbe: ");


        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("suma: " + sum);
        System.out.println("średnia: " + sum / numbers);
    }
}
