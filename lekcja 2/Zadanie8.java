package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;

        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        num = sn.nextInt();

        System.out.println("Dzielniki liczby " + num + " to: ");
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(num);


    }
}
