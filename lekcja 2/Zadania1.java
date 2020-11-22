package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;

        Scanner sn = new Scanner(System.in);
        do{
        System.out.println("Podaj liczbe wieksza od 0: ");
        num= sn.nextInt();
        }while(num<=0);

        for(int i=1; i<=num ; i+=2){
            System.out.print(i + " ");
        }


    }
}
