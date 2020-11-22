package com.company;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        double sum;
        Scanner sn = new Scanner(System.in);

//        while (true) {

        sum = 0;
        int l1;
        int l2;
        System.out.println("---------Kalkulator-------");
        System.out.println("Podaj pierwsza liczbe: ");
        l1 = sn.nextInt();
        System.out.println("Podaj druga liczbe: ");
        l2 = sn.nextInt();
        System.out.println("podaj operacje:(+, -, *, /): ");
        String symbol = sn.next();


        switch (symbol) {
            case ("+"):
                sum = l1 + l2;
                break;
            case ("-"):
                sum = l1 - l2;
                break;
            case ("*"):
                sum = l1 * l2;
                break;
            case ("/"):
                if (l2 != 0) {
                    sum = l1 / l2;

                } else {
                    System.out.println("Nie można dzielić przez 0");
                }
                break;
            default:
                System.out.println("Nieznany symbol");
        }
        if (l2 != 0) System.out.println("Wynik wynosi: " + sum);
        sn.nextLine();
        sn.nextLine();

//        }
    }
}

