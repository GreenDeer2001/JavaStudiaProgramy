package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int result = 0;


        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        while ((num = sn.nextInt()) != 0) {
            result += num;
            System.out.println("Podaj liczbe: ");
        }
        System.out.println("Suma wynosi: " + result);


    }
}
