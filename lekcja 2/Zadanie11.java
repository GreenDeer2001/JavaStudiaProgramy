package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;


        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj ilosc wierszy choinki: ");
        num = sn.nextInt();

        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < num; j++) {
                if (j < i) {
                    System.out.printf(" ");
                } else if (j == i) {
                    System.out.printf("*");
                } else {
                    System.out.printf("**");
                }
            }
            System.out.println();
        }


    }
}
