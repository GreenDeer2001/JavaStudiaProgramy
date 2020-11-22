package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();


        System.out.println(strToInt(text));

    }

    public static int strToInt(String str) {

        char[] chars = str.toCharArray();
        if (chars.length == 0) return 0;

        int finalNum = 0;
        boolean type = (chars[0] == '-');

        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i]) && chars[i] != 'e' && chars[i] != '+' && chars[i] != '-') {
                break;
            } else if (chars[i] == 'e') {
                if (Character.isDigit(chars[i + 1])) {

                    double pow = Math.pow(10, Character.getNumericValue(chars[i + 1]));
                    finalNum *= pow;
                }
                break;
            } else if (chars[i] != '+' && chars[i] != '-') {
                finalNum *= 10;
                finalNum += Character.getNumericValue(chars[i]);
            } else if (chars[i] == '+' || chars[i] == '-') {
                if (i != 0) break;
            }
        }


        return type ? (finalNum * (-1)) : finalNum;
    }
}
