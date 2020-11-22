package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        Random r = new Random();
        int random = r.nextInt(100);

        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        while ((num = sn.nextInt()) != random) {
            if(num< random) System.out.println("Za mało");
            if(num> random) System.out.println("Za dużo");

        }
        System.out.println("Gratulacje , wygrałes");
    }
}
