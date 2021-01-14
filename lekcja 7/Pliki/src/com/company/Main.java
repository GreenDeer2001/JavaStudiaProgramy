package com.company;

import java.io.*;
import java.util.Random;

public class Main {

    static Random r = new Random();

    public static void main(String[] args) {

        String path1 = "./dane1.txt";
        String path2 = "./dane2.txt";
        String wynik = "./wynik.txt";


        render(path1);
        render(path2);

        multiply(path1);
        multiply(path2);

        sum(path1, path2, wynik);

    }

    public static void render(String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            for (int i = 0; i < 100; i++) {
                bw.write("" + r.nextInt(100));
                bw.write(System.lineSeparator());
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void multiply(String path) {
        try {
            FileWriter fw = new FileWriter(path, true);
            BufferedReader br = new BufferedReader(new FileReader(path));
            for (int i = 0; i < 100; i++) {
                String line = br.readLine();
                fw.write("" + Integer.parseInt(line) * 1.15);
                fw.write(System.lineSeparator());
            }
            fw.write(System.lineSeparator());
            fw.write(System.lineSeparator());

            fw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }


    public static void sum(String path1, String path2, String resultPath) {
        try {
            BufferedWriter fw = new BufferedWriter(new FileWriter(resultPath, true));
            BufferedReader br1 = new BufferedReader(new FileReader(path1));
            BufferedReader br2 = new BufferedReader(new FileReader(path2));
            for (int i = 0; i < 200; i++) {
                String line = br1.readLine();
                String line2 = br2.readLine();
                System.out.println(line);
                System.out.println(line2);
                if (line != "" && line2 != "") {
                    fw.write((Double.parseDouble(line) + Double.parseDouble(line2)) + "");
                    fw.write(System.lineSeparator());
                }
            }
            fw.close();
            br1.close();
            br2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
