package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner((System.in));
        System.out.println("Spradź czy wyraz jest polindromem : ");
        String text = sn.nextLine();

        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();

        if (text.equals(reversedText.toString())) {
            System.out.println(text + " jest polindromem");
        } else {
            System.out.println(text + " nie jest polindromem");

        }

    }
}
