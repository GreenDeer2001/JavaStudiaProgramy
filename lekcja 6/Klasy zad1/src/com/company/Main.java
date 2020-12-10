package com.company;


import java.io.IOException;

public class Main {



        public static void main(String [] args) throws IOException {
            Pozycja p1 = new Pozycja("Chleb", 6, 3.5);
            System.out.println(p1);
            Pozycja p2 = new Pozycja("Cukier", 13, 4);
            System.out.print(p2);
            Zamowienie z = new Zamowienie(20);
            z.dodajPozycje(p1);
            z.dodajPozycje(p2);
            System.out.println(z);

           p1.obliczWartoscZRabatem();
        }

}
