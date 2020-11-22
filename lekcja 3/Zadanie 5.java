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

        System.out.println();
        System.out.println("W zu1:");
        int[] zu1 = toZu1(converted.clone());
        for (int i = 0; i < zu1.length; i++) {
            System.out.print(zu1[i]);
        }

        System.out.println();
        System.out.println("W zu2:");
        int[] zu2 = toZu2(converted.clone());
        for (int i = 0; i < zu2.length; i++) {
            System.out.print(zu2[i]);
        }

    }

    public static int[] conversation(int num) {
        int[] binary = new int[8];
        int[] temp = new int[8];

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

    public static int[] toZu1(int[] arr) {

        if (arr[0] == 0) return arr;
        int[] convertedArr = new int[arr.length];
        convertedArr[0] = arr[0];

        for (int i = 1; i < convertedArr.length; i++) {
            convertedArr[i] = (arr[i] == 0) ? 1 : 0;
        }
        return convertedArr;
    }

    public static int[] toZu2(int[] arr) {

        if (arr[0] == 0) return arr;
        int[] convertedArr = arr.clone();
        convertedArr[0] = arr[0];
        int lastIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) lastIndex = i;
        }
        for (int i = 1; i < lastIndex; i++) {
            convertedArr[i] = (arr[i] == 0) ? 1 : 0;
        }
        return convertedArr;
    }



}


