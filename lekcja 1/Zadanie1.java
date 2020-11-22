package com.company;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj Stopnie w skali Celcjiusza: ");
        double  celciusz = sn.nextDouble();

        double fahraint = 32+ (celciusz*1.8);
        System.out.println("Stopnie w skali Fahrainta:"+ fahraint );


    }


}

