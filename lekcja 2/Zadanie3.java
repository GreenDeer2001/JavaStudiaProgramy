package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;

        Scanner sn = new Scanner(System.in);
        do{
        System.out.println("Podaj maksymalna liczbe dodatnia: ");
            num= sn.nextInt();

        }while(num <0);

        for(int i=0; Math.pow(2,i)<=num; i++){
            System.out.println((int)Math.pow(2,i));
        }
    }
}
