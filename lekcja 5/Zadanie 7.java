package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();
        System.out.println("Podaj wyraz do wyszukania :");
        String co = sn.nextLine();


        System.out.println(strfind(text, co));

    }

    public static int strfind(String text, String co) {
        if (co.trim().equals("")) return 1;
        if (!text.contains(co.trim())) return 0;
        int index = text.indexOf(co);

        return index;
    }
}

