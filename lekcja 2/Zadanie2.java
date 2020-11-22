package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1;
        int num2;
        int resultF=0;
        int resultW=0;
        int resultDW=0;


        Scanner sn = new Scanner(System.in);
        do{
        System.out.println("Podaj liczbe A: ");
            num1= sn.nextInt();

            System.out.println("Podaj liczbe B: ");
            num2= sn.nextInt();

        }while(num1>= num2);

        for(int i=num1; i<=num2 ; i++){
            resultF += i;
        }
        int helper=num1;
        while (helper <= num2){
            resultW += helper;
            helper++;
        }

        helper= num1;
        do{
            resultDW += helper;
            helper++;
        }while(helper <= num2);
        

        System.out.println(resultF);
        System.out.println(resultW);
        System.out.println(resultDW);
    }
}
