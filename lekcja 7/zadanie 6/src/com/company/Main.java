package com.company;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        String pathIN = "C:\\Users\\Legion\\Desktop\\java\\Pliki\\plik.txt";

        toHtml(pathIN);
    }

    public static void toHtml(String nazwaPliku) throws IOException {
        BufferedReader br = null;
        FileWriter fw = null;
        try {
            br = new BufferedReader(new FileReader(nazwaPliku));
            fw = new FileWriter("output.txt", true);
            String line;
            fw.write("<html><body><table>");
            while ((line = br.readLine()) != null) {
                String[] texts = line.split(" ");
                for (int i = 0; i < texts.length; i++) {
                    String textToWrite = "";
                    if (i == 0) {
                        textToWrite = textToWrite.concat("<tr>");
                    }
                    textToWrite = textToWrite.concat("<td>" + texts[i] + "</td>");
                    if (i == texts.length - 1) {
                        textToWrite = textToWrite.concat("</tr>");
                    }
                    fw.write(textToWrite);
                    i++;
                }
                System.out.println(texts[1]);
                fw.write(System.lineSeparator());
            }
            fw.write("</table></body></html>");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}





