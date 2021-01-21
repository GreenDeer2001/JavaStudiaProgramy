package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Automat Automat = new Automat();

        Automat.zasilAutomat(new Moneta(5, 2));

        Moneta[] monety = new Moneta[2];

        monety[0] = new Moneta(2, 1);
        monety[1] = new Moneta(0.5, 4);

        Automat.kupNapoj(monety);

        System.out.println(Automat.stan());

        Automat.zapiszDoPliku("./plik.txt");

    }
}
