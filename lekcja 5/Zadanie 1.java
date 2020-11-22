package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj liczbe: ");
        int num = sn.nextInt();


        System.out.println(interation(num));
        System.out.println(recurention(num));


    }

    public static int interation(int num) {
        int temp = 1;
        for (int i = 1; i <= num; i++) {
            temp *= i;

        }
        return temp;
    }

    public static int recurention(int num) {

        if (num == 1) return 1;
        return num * (recurention(num - 1));
    }
}
