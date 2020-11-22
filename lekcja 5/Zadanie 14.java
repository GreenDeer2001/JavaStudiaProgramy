package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        Scanner sn = new Scanner(System.in);
//        System.out.println("Podaj 1 wyraz: ");
//        String text1 = sn.nextLine();
//        System.out.println("Podaj 2 wyraz: ");
//        String text2 = sn.nextLine();

//        System.out.println(czyAnagram(text1, text2));

        System.out.println(czyAnagram("kolej", "olejk"));
        System.out.println(czyAnagram("kolej", "kole"));
        System.out.println(czyAnagram("kolej", "K O L E J"));
        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
    }

    public static boolean czyAnagram(String t1, String t2) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (int i = 0; i < t1.length(); i++) {
            if (Character.isLetter(t1.charAt(i))) {
                list1.add(Character.toUpperCase(t1.charAt(i)));

            }
        }
        for (int i = 0; i < t2.length(); i++) {
            if (Character.isLetter(t2.charAt(i))) {
                list2.add(Character.toUpperCase(t2.charAt(i)));
            }
        }

        final int SIZE = list1.size();
        if (list1.size() != list2.size()) return false;
        for (int i = 0; i < SIZE; i++) {
            if (list1.contains(list2.get(0))) {
                list1.remove(list2.get(0));
                list2.remove(0);
            }
            if (list1.isEmpty() && list2.isEmpty()) {
                return true;
            }
        }

        return false;
    }


}

