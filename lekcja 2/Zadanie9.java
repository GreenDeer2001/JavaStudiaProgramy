package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        boolean isPrime = true;

        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        num = sn.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Podana liczba jest liczba pierwsza");
        } else {
            System.out.println("Podana liczba nie jest liczba pierwsza");

        }


    }
}
