package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        int a = 1;
        int b = 1;


        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj X(wspolrzedna lewego gornego rogu): ");
        x = sn.nextInt();
        System.out.println("Podaj y(wspolrzedna lewego gornego rogu): ");
        y = sn.nextInt();
        System.out.println("Podaj a(dlugosc): ");
        a = sn.nextInt();
        System.out.println("Podaj b(szerokosc): ");
        b = sn.nextInt();

  
        for (int i = 0; i < y + b; i++) {
            if (y <= i) {
                for (int j = 0; j < x + a; j++) {
                    if (j < x) {
                        System.out.print("_");
                    } else {
                        System.out.print("X");
                    }
                }
            } else {
                System.out.printf("-");
            }
            System.out.println();
        }

    }
}
