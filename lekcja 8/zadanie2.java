package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws IOException {

        int w = 100;
        int h = 100;
        int maxColor = 255;

        String path = "./obrazek.pgm";
        RandomAccessFile raf = new RandomAccessFile(path,"rw");

        String header = "p5";
        raf.writeBytes(header);
        for(int i= 0 ; i< w*h; i++){
            int color = i% 2 == 0 ? 0 : maxColor;
            raf.writeByte(color);

        }
        raf.close();


    }



}
