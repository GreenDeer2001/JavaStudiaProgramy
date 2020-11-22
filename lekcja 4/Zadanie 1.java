package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner((System.in));
        System.out.println("Podaj wyraz: ");
        String text = sn.nextLine();

        char last = text.charAt(text.length()-1);
        int count = 0;
        System.out.println(last);

        for(int i=0 ; i< text.length() ; i++){
            if(text.charAt(i) == last){
                count ++;
            }
        }
        System.out.println("Ostatni znak " + last + " powtarza się: " + count + " razy");

    }
}
