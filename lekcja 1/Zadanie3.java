package com.company;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj wage(kg): ");
        int waga = sn.nextInt();
        System.out.println("Podaj wzrost(cm): ");
        double wzrost = sn.nextInt();
        wzrost /= 100;


        double BMI = waga / Math.pow(wzrost, 2);
        String wynik = "Niedowaga";
        if (BMI > 18.5) wynik = "Waga prawidłowa";
        if (BMI > 24.9) wynik = "Nadwaga";


        System.out.println(wynik);


    }


}

