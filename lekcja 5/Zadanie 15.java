package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("HEX color: ");
        String text1 = sn.nextLine();

        for (int e : HTMLColor2RGB(text1)) {
            System.out.println(e);
        }
    }

    public static int[] HTMLColor2RGB(String color) {

        if (!color.startsWith("#") || color.length() != 7) {
            System.out.println("zła wartość :");
            return new int[]{0, 0, 0};
        }
        int[] hex = new int[3];
        for (int i = 1; i <= color.length() / 2; i++) {

            hex[i - 1] = Integer.parseInt(
                    Character.toString(color.charAt((i * 2) - 1)) +
                            color.charAt(i * 2), 16);
        }
        return hex;
    }
}

