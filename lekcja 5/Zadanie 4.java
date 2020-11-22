package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();


        System.out.println(flipCase(text));

    }

    public static String flipCase(String text) {
        String temp = "";

        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                temp += Character.toLowerCase(c);
            } else {
                temp += Character.toUpperCase(c);

            }
        }
        return temp;
    }
}
