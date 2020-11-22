package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz do odwócenia : ");
        String text = sn.nextLine();

        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();

        System.out.println(reversedText);




    }
}
