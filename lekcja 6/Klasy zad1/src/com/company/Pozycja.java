package com.company;

public class Pozycja {

    private String nazwa;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwa, int ileSztuk, double cena) {
        this.nazwa = nazwa;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    @Override
    public String toString() {
        double poRabacie =Math.ceil(obliczWartoscZRabatem()*100)/100;
        double roznica =  Math.ceil((obliczWartosc() - poRabacie)*100)/100;
        return this.nazwa + " " + this.cena + " zł   "+ this.ileSztuk + " szt.   "
                + poRabacie + " zł  " + "rabat : " + roznica ;

    }

    public double obliczWartosc() {
        return (this.cena * this.ileSztuk);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIleSztuk() {
        return ileSztuk;
    }

    public void setIleSztuk(int ileSztuk) {
        this.ileSztuk = ileSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double obliczWartoscZRabatem() {
        double wartosc = obliczWartosc();
        if (ileSztuk > 20) {
            return wartosc * 0.85;
        } else if (ileSztuk >= 10) {
            return wartosc * 0.9;
        } else if (ileSztuk >= 5) {
            return wartosc * 0.95;
        }

        return wartosc;
    }
}
