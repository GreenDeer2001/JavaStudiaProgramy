package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj pierwszy  wyraz:");
        String text = sn.nextLine();
        System.out.println("Podaj drugi  wyraz:");
        String prefix = sn.nextLine();


        System.out.println(startsWith(text , prefix));

    }

    public static boolean startsWith(String str1, String str2) {

        if(str1.trim().startsWith(str2.trim())) return true;

        return false;
    }
}
