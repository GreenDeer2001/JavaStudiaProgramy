package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz ciągu: ");
        int num = sn.nextInt();


        System.out.println(interation(num));
        System.out.println(recurention(num));


    }

    public static int interation(int num) {
        int prev = 0;
        int actual = 1;
        for (int i = 1; i < num; i++) {
            actual += prev;
            prev = actual - prev;

        }
        return actual;
    }

    public static int recurention(int num) {

        if (num == 1) return 1;
        if (num == 0) return 0;
        return recurention(num - 2) + recurention(num - 1);
    }
}
