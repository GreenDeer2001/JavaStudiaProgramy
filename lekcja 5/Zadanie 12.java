package com.company;

import java.security.Key;
import java.util.Scanner;

public class Main {

    final static String KEY = "ma";

    public static void main(String[] args) {

        String[] words = new String[]{"mamla", " mama ", "+12", "0001", "991-234-3",
                "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};

        System.out.println(p1(words));
        System.out.println(p2(words));
        System.out.println(p3(words));
        System.out.println(p4(words));
        System.out.println(p5(p3(words), p4(words)));


    }

    public static int p1(String[] words) {

        int sum = 0;
        for (String str : words) {


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
                } else {

                }
            }
            sum += type ? (finalNum * (-1)) : finalNum;
        }

        return sum;

    }

    public static String p2(String[] words) {
        String total = "";
        for (String str : words) {

            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!Character.isDigit(chars[i]) && chars[i] != 'e' && chars[i] != '+' && chars[i] != '-') {
                    total += str;
                    break;
                }
            }
        }

        return total;
    }

    public static int p3(String[] words) {
        int count = 0;

        for (String str : words) {

            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {

                String temp = Character.toString(chars[i]) + (chars[i + 1]);
                if (temp.equals(KEY)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int p4(String[] words) {
        int count = 0;

        String str = p2(words);

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {

            String temp = Character.toString(chars[i]) + (chars[i + 1]);
            if (temp.equals(KEY)) {
                count++;
            }
        }

        return count;
    }

    public static double p5(int one, int two) {
        return (double) one / two;
    }
    
}

