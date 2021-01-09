package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Main {
    static Random r = new Random();


    public static void main(String[] args) throws IOException {

        String path = "./plik.dat";
        odwrocKolejnosc(path);
    }

    public static void odwrocKolejnosc(String path) throws IOException {

        RandomAccessFile RAF = new RandomAccessFile(path, "rw");
        for (int i = 0; i < 10; i++) {
            RAF.writeInt(r.nextInt(100));
        }
        RAF.seek(0);
        for(int i =0 ; i<10; i++){
            int a  = RAF.readInt();
            System.out.println(a);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            RAF.seek(i*4);
            int a = RAF.readInt();
            RAF.seek(36-i*4);
            int b = RAF.readInt();
            RAF.seek(i*4);
            RAF.writeInt(b);
            RAF.seek(36-i*4);
            RAF.writeInt(a);
        }
        System.out.println();
        RAF.seek(0);
        for(int i =0 ; i<10; i++){
            int a  = RAF.readInt();
            System.out.println(a);
        }
        RAF.close();
    }
}
