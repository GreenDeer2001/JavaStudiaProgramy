package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

    int range = 10;
        int[] variables = new int[100000];
        int[] helper = new int[range];

        Random r = new Random();

        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < variables.length; i++) {
            variables[i] = r.nextInt(range)+1;
            System.out.print(variables[i] + " ");
        }
        System.out.println();
        for(int i=0; i<variables.length;i++){
            helper[variables[i]-1] ++;
        }
        for (int i=0; i<helper.length; i++){
            System.out.println(i+1 +" - " + helper[i]);
        }
    }
}
