package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();
        
        System.out.println(wordCount(text));
    }

    public static int wordCount(String text) {

        return text.split(" ").length;
    }
}

