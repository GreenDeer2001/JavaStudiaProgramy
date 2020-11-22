package com.company;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj dochód: ");

        final double prog = 85528;

        double dochod = sn.nextDouble();
        double podatek;

        if (dochod < 0) {
            podatek = 0;
        } else if (dochod < prog) {
            podatek = dochod * 0.18 - 556.02;
        } else {
            podatek = 14839.02 + (dochod - prog) * 0.32;
        }
        if (podatek < 0) podatek = 0;

        System.out.println("Należny podatek: " + podatek);


    }


}

