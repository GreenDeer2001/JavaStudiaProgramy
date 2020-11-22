package com.company;

import java.util.Scanner;
import java.util.function.Predicate;

public class Zadanie6 {

    public static void main(String[] args) {

        boolean valid = true;
        int raty;
        double cena;
        double mRata;

        do {
            Scanner sn = new Scanner(System.in);
            System.out.println("Podaj cene: ");
            cena = sn.nextDouble();
            System.out.println("Podaj ilość rat: ");
            raty = sn.nextInt();

            if (cena < 100 || cena > 100000) {
                System.out.println("Nieprawidłowa cena");
                valid = false;
            }
            if (raty < 6 || raty > 48) {
                System.out.println("Nieprawidłowa ilość rat");
                valid = false;
            }
        } while (!valid);


        if (raty < 12) {
            mRata = (cena *= 1.025) / raty;
            System.out.println(mRata);
        } else if (raty < 24) {
            mRata = (cena *= 1.05) / raty;
        } else {
            mRata = (cena *= 1.1) / raty;
        }


        System.out.println("Miesięczna rata wynosi:" + (Math.ceil(mRata * 100)) / 100);
    }
}

