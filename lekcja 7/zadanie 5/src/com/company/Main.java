package com.company;

import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        String pathIN = "C:\\Users\\Legion\\Desktop\\java\\Pliki\\plik.txt";

        emerytura(pathIN);


    }

    public static void emerytura(String nazwaPliku) throws IOException {
            BufferedReader br = null;
            FileWriter fw = null;
            try {
                br = new BufferedReader(new FileReader(nazwaPliku));
                fw= new FileWriter("output.txt",true);
                String nextLine;
                while((nextLine = br.readLine()) != null){
                    String[] person = nextLine.split(" ");
                   int yearsToRetirement;
                   if(person[2].equals("M")){
                       yearsToRetirement = 65 - Integer.parseInt(person[3]);
                   }else{
                       yearsToRetirement = 60 - Integer.parseInt(person[3]);

                   }
                    String result = person[0] + " " + person[1] + " " + yearsToRetirement;
                   fw.write(result);
                    fw.write(System.lineSeparator());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if(br != null){
                    br.close();
                }
                if(fw!= null){
                    fw.close();
                }
            }
    }
}





