package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int sum = 0;
        int sumP = 0;  // suma parzystych
        int sumN = 0; // suma nieparzysnych
        int iP = 0; // ilosc parzystych
        int iN = 0; // ilosc parzystych


        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        num = sn.nextInt();


        do {
            int temp = num % 10;
            sum += temp;
            System.out.println(temp);
            num /= 10;

            if (temp % 2 == 0) {
                iP++;
                sumP += temp;

            } else {
                iN++;
                sumN += temp;
            }


        } while (num >= 1);


        System.out.println("Suma cyfr wynosi: " + sum);
        if (sumP != 0) System.out.println("Srednia arytmetyczna parzystych cyfr wynosi: " + (double) sumP / iP);
        if (sumN != 0) System.out.println("Srednia arytmetyczna nieparzystych cyfr wynosi: " + (double) sumN / iN);

        if (sumN != 0 && sumP != 0) {
            double result = ((double) sumP / iP) / ((double) sumN / iN);
            System.out.println("stosunek wynosi: " + result);
        } else {
            System.out.println("Nie można obliczyć średniej");
        }


    }
}
