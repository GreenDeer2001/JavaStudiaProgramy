package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();

        podzielNaSlowa((text));
    }

    public static String[] podzielNaSlowa(String tekst) {

        return tekst.split(" ");
    }
}

