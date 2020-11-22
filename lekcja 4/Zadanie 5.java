package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner((System.in));
        System.out.println("Zdanie : ");
        int left = 0;
        int rigth = 0;
        String text = sn.nextLine();
        String[] textArray = text.split("");


        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == "(") left++;
            if (textArray[i] == ")") rigth++;
        }

        if (left == rigth) {
            System.out.println("Błędne sparowanie nawiasów");
        } else {
            System.out.println("OK");
        }
    }
}
