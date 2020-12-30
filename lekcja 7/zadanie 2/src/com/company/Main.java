package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String pathIN = "C:\\Users\\Legion\\Desktop\\Pliki\\plik.txt";
        String pathOUT = "C:\\Users\\Legion\\Desktop\\Pliki\\result.txt";

     szukaj(pathIN, pathOUT, "egzamin");

    }

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy,String slowo){
        BufferedReader fr = null;
        FileWriter writer = null;
        int counter = 0;

        try {
            fr = new BufferedReader(new FileReader(nazwaPlikWe));
            writer = new FileWriter(nazwaPlikWy, true);
            System.out.println();
            String line;
            while ((line = fr.readLine()) != null) {
                counter++;
                if(line.contains(slowo)){
                    System.out.println(counter + ": " + line);
                    writer.write(counter + ": " + line);
                    writer.write(System.lineSeparator());
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
