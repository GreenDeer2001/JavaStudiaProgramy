package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();
        System.out.println("Podaj start:");
        int start = sn.nextInt();
        System.out.println("ile liter:");
        int ile = sn.nextInt();


        System.out.println(strcut(text, start, ile));
    }

    public static String strcut(String str, int start, int ile) {
        String modString = str.substring(0, start) + str.substring(start + ile);

        return modString;
    }
}

