package com.company;

import java.awt.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader fr = null;
        String path = "C:\\Users\\Legion\\Desktop\\Pliki\\plik.txt";
        int[] values = new int[3];


        try {
            fr = new BufferedReader(new FileReader(path));
            String line;
            while ((line = fr.readLine()) != null) {
                char[] charLine = line.toCharArray();
                values[0] += charLine.length;
                for (char c : charLine) {
                    if (Character.isWhitespace(c)) {
                        values[1] = values[1] + 1;
                    }
                }
                for (String str : line.trim().split(" ")) {
                    if (str != "") {
                        System.out.println(str);
                        values[2] = values[2] + 1;

                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        for (int i : values) {
            System.out.println(i);
        }
    }
}
