package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Lista {
    private int[] liczby;
    private int pojemnosc;
    private int rozmiar;

    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;
        this.liczby = new int[pojemnosc];
    }

    public void dodajElement(int element) {
        if (this.rozmiar == this.pojemnosc) {
            System.out.println("Lista jest pełna");
        } else {
            this.liczby[this.rozmiar] = element;
            this.rozmiar++;
        }
    }

    public int znajdz(int element) {
        int index = -1;
        for (int i = 0; i < this.liczby.length; i++) {
            if (this.liczby[i] == element) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);

        return index;
    }

    public void pisz() {
        System.out.println();
        System.out.println("Pojemność:" + this.pojemnosc);
        System.out.println("Rozmiar:" + this.rozmiar);
        System.out.println("Wartości:");
        for (int i = 0; i < this.rozmiar; i++) {
            System.out.print(this.liczby[i] + "  ");
        }
    }

    public void przesun(){
        for(int i=0; i<this.rozmiar-1;i++){
            if(this.liczby[i] == 0 && this.liczby[i+1] != 0){
                for(int j = i; j<this.rozmiar-1;j++){
                    this.liczby[j] = this.liczby[j+1];
                }
                this.liczby[this.rozmiar-1] = 0;
            }
        }
    }

    public void usunPierwszy(int element) {
        for (int i = 0; i < this.rozmiar; i++) {
            if (this.liczby[i] == element) {
                this.liczby[i] = 0;
                przesun();
                this.rozmiar--;
                break;
            }
        }
    }

    public void usunKolejne(int element) {
        boolean delete = false;
        for (int i = 0; i < this.rozmiar; i++) {
            if (this.liczby[i] == element) {
                if (delete) {
                    this.liczby[i] = 0;
                    przesun();
                    this.rozmiar--;
                } else {
                    delete = true;
                }
            }
        }
    }


    public void usunPowtorzenia() {
        for (int i = 0; i < this.liczby.length; i++) {
            usunKolejne(this.liczby[i]);
        }
    }


    public void odwroc() {
        for (int i = 0; i < this.rozmiar / 2; i++) {
            int temp = this.liczby[i];
            this.liczby[i] = this.liczby[this.rozmiar - i - 1];
            this.liczby[this.rozmiar - i - 1] = temp;
        }
    }
}


