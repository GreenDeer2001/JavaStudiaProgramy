package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz:");
        String text = sn.nextLine();

        System.out.println("Podaj znak: ");
        char z = sn.nextLine().charAt(0);


        System.out.println("znak występuje na pozycji : " + strpos(text, z));
        
    }

    public static int strpos(String text, char z) {


        return text.indexOf(z) + 1;
    }
}
