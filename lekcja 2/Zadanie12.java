package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zl;
        int gr;

        int zl5 = 0;
        int zl2 = 0;
        int zl1 = 0;

        int gr50 = 0;
        int gr20 = 0;
        int gr10 = 0;
        int gr5 = 0;
        int gr2 = 0;
        int gr1 = 0;


        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj kwote ([zł] [gr]): ");
        zl = sn.nextInt();
        gr = sn.nextInt();

        while (zl >= 1) {
            if (zl >= 5) {
                zl -= 5;
                zl5++;
            } else if (zl >= 2) {
                zl -= 2;
                zl2++;
            } else {
                zl -= 1;
                zl1++;
            }
        }

        while (gr >= 1) {
            if (gr >= 50) {
                gr -= 50;
                gr50++;
            } else if (gr >= 20) {
                gr -= 20;
                gr20++;
            } else if (gr >= 10) {
                gr -= 10;
                gr10++;
            } else if (gr >= 5) {
                gr -= 5;
                gr5++;
            } else if (gr >= 2) {
                gr -= 2;
                gr2++;
            } else {
                gr -= 1;
                gr1++;
            }
        }

        if (zl5 != 0) System.out.println(zl5 + " x " + "5zł");
        if (zl2 != 0) System.out.println(zl2 + " x " + "2zł");
        if (zl1 != 0) System.out.println(zl1 + " x " + "1zł");

        if (gr50 != 0) System.out.println(gr50 + " x " + "50gr");
        if (gr20 != 0) System.out.println(gr20 + " x " + "20gr");
        if (gr10 != 0) System.out.println(gr10 + " x " + "10gr");

        if (gr5 != 0) System.out.println(gr5 + " x " + "5gr");
        if (gr2 != 0) System.out.println(gr2 + " x " + "2gr");
        if (gr1 != 0) System.out.println(gr1 + " x " + "1gr");

    }
}
