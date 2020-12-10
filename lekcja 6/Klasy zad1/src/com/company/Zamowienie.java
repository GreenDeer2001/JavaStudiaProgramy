package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Zamowienie {

    Pozycja[] pozycje;
    int ileDodanych;
    int maksRozmiar;

    public Zamowienie() {
        this.maksRozmiar = 10;
        ileDodanych = 0;
        this.pozycje = new Pozycja[maksRozmiar];
    }

    public Zamowienie(int max) {
        this.maksRozmiar = max;
        ileDodanych = 0;
        this.pozycje = new Pozycja[max];

    }


    public void dodajPozycje(Pozycja product) {
       boolean exist = Arrays.stream(this.pozycje).anyMatch(item-> item == product);
       if(exist){
           for(Pozycja p : this.pozycje){
               if(p == product){
                   p.setIleSztuk(p.getIleSztuk()+1);
               }
           }
       }else{
           this.pozycje[ileDodanych] = product;
           this.ileDodanych++;
       }
    }

    public  void obliczWartosc() {
        double total = 0;
        double totalZRabatem = 0;
        for (Pozycja p : this.pozycje) {
            if(p != null){
            total += p.obliczWartosc();
            totalZRabatem += p.obliczWartoscZRabatem();
            }

        }
        System.out.println("razem: " + total);
        System.out.println("razem z rabatem: " + totalZRabatem);

    }

    public  void usunPozycje(int indeks){
        this.pozycje[indeks] = null;
    }
    public void edytujPozycje(int indeks){
        if(this.pozycje[indeks]!= null){
            Pozycja product = this.pozycje[indeks];
            Scanner sn = new Scanner(System.in);
            System.out.println("Produkt do edycji : " + product);
            System.out.println("! Jeżeli chcesz zostawić bez zmian naciśnij enter");
            System.out.println("Nowa nazwa: ");
            String nazwa = sn.nextLine();
            System.out.println("! Jeżeli chcesz zostawić bez zmian wpisz 0");
            System.out.println("Nowa ilosc sztuk: ");
            int ilosc = sn.nextInt();
            System.out.println("! Jeżeli chcesz zostawić bez zmian wpisz 0");
            System.out.println("Nowa cene: ");
            double cena = sn.nextDouble();


            if(nazwa.trim() != "") product.setNazwa(nazwa);
            if(ilosc != 0) product.setIleSztuk(ilosc);
            if(cena != 0) product.setCena(cena);

        }else{
            System.out.println("nie ma takiego Produktu");
        }
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println();
        System.out.println("zamowinia: ");
        for (Pozycja p : this.pozycje) {
            if(p != null)
            System.out.println(p);
        }
        System.out.println();
        obliczWartosc();

        return "";
    }
}
