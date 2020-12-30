package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {

        String pathIN = "C:\\Users\\Legion\\Desktop\\java\\Pliki\\plik.txt";
        String szyfr = "C:\\Users\\Legion\\Desktop\\java\\Pliki\\szyfr.txt";

        szyfruj(pathIN,2);
        deszyfruj(szyfr, 2);


    }

    public static void szyfruj(String nazwa, int shift) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        int asciiCode;
        try {
            fr = new FileReader(nazwa);
            fw = new FileWriter("szyfr.txt", true);
            while ((asciiCode = fr.read()) != -1) {
                fw.write(asciiCode+shift);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                fr.close();
            }
            if(fw!= null){
                fw.close();
            }
        }

    }

    public static void deszyfruj(String nazwa, int shift) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        int asciiCode;
        try {
            fr = new FileReader(nazwa);
            fw = new FileWriter("_szyfr.txt", true);
            while ((asciiCode = fr.read()) != -1) {
                fw.write(asciiCode-shift);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                fr.close();
            }
            if(fw!= null){
                fw.close();
            }
        }
    }


}

