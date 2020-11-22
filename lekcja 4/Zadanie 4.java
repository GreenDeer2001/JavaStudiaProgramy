package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner((System.in));
        System.out.println("Zdanie : ");
        ArrayList<Integer> digitals = new ArrayList<>();
        String text = sn.nextLine();

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        for (char c : chars) {
            if (Character.isDigit(c)) {
                digitals.add(Character.getNumericValue(c));
            }
        }

        int sum = digitals.stream().reduce(0, (total, next) -> total + next);

        System.out.println("suma cyfr wynosi: " + sum);


    }
}
