package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        String converted = "";
        System.out.println("Wyraz do zaszyfrowania : ");
        String text = sn.nextLine();
        System.out.println("Podaj przesunięcie: ");
        int shift = sn.nextInt();
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        for (int i = 0; i < text.length(); i++) {
            chars[i] += shift;
            converted += chars[i];
        }

        System.out.println("Zaszyfrowany tekst: " + converted);
        
    }
}
