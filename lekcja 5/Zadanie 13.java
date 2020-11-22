package com.company;


public class Main {


    public static void main(String[] args) {

        String tekst = "Egzamin";
        int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
        System.out.println(poprzestawiaj(tekst, kol));
        
    }

    public static String poprzestawiaj(String tekst, int [] kolejnosc){
        String modString = "";

        for(int i=0; i< kolejnosc.length; i++){
            modString += tekst.charAt(kolejnosc[i]);
        }

        return modString;
    }


}

