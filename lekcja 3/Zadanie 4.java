package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int num;


        System.out.println("Podaj liczbę do konwersji");
        num = sn.nextInt();

        int[] converted = conversation(num);
        System.out.println("Liczba po konwersji: ");
        for (int i = 0; i < converted.length; i++) {
            System.out.print(converted[i]);
        }
    }


    public static int[] conversation(int num) {
        int[] binary = new int[32];
        int[] temp = new int[32];

        int i = 0;
        int absNumber = Math.abs(num);
        while (absNumber != 0) {

            temp[i] = (absNumber % 2);
            absNumber /= 2;
            i++;
        }
        System.out.println(temp.length);
        for (int j = 0; j < temp.length; j++) {
            binary[binary.length - (j + 1)] = temp[j];
        }
        binary[0] = num < 0 ? 1 : 0;
        return binary;
    }
}



