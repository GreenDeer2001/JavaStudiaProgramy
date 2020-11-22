package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int num;

        System.out.println("Podaj liczbe: ");
        num = sn.nextInt();
        System.out.print("  ");
        for(int i = 0 ; i< num ; i++){
            System.out.print(i+1 + " ");
        }
        char[][] array = new char[num][num];
        for(int i =0; i< array.length; i++){
            System.out.println();
            System.out.print(i+1 + " ");

            for (int j=0; j < array[i].length;j++){
                array[i][j] = checkNumbers(i+1,j+1);
                System.out.print(array[i][j] + " ");
            }
        }


    }
    public static char checkNumbers(int a ,int b){
        ArrayList<Integer> dividers = new ArrayList<>();
        boolean helper = false;
        for(int i =2;i<=a;i++){
            if(a % i == 0) dividers.add(i);
        }
        for(int i = 0; i< dividers.size(); i++){
            if(b % dividers.get(i) == 0){
                helper = true;
                break;
            }
        }



        return helper ? '.' : '+';
    }



}


