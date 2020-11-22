package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();
        System.out.println("Podaj wyraz:");
        String co = sn.nextLine();


        System.out.println(strFindAndCount(text, co));
    }

    public static int strFindAndCount(String text, String co) {
        String[] arr = text.split(" ");
        int count = 0;

        for (String str : arr) {
            if (str.equals(co)) {
                count++;
            }
        }

        return count;
    }
}

