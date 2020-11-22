package com.company;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Podaj 3 liczby: ");
        int l1 = sn.nextInt();
        int l2 = sn.nextInt();
        int l3 = sn.nextInt();

        int min = l1;
        int max = l1;

        if(l2 > max) max=l2;
        if(l3 > max) max=l3;

        if(l2<min) min=l2;
        if(l3<min) min=l3;

        System.out.println("Liczba minimalna to: " +  min +","+ "Liczba maksymalna to : " + max);



    }


}

