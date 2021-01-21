package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Automat {

    private Moneta[] monety;

    public Automat() {
        this.monety = new Moneta[5];
        monety[0] = new Moneta(5, 0);
        monety[1] = new Moneta(2, 0);
        monety[2] = new Moneta(1, 0);
        monety[3] = new Moneta(0.5, 0);
        monety[4] = new Moneta(0.2, 0);
    }

    public void zasilAutomat(Moneta moneta) {
        for (Moneta m : monety) {
            if (m.nominal == 5 || m.nominal == 2 || m.nominal == 1 ||
                    m.nominal == 0.5 || m.nominal == 0.2)
                if (m.nominal == moneta.nominal) {
                    m.liczba += moneta.liczba;
                }
        }
    }

    void kupNapoj(Moneta[] monetyDoZaplaty) {
        for (Moneta m : monetyDoZaplaty) {
            if(m != null){
            zasilAutomat(m);
            }
        }
    }

    public double stan() {
        double result = 0;

        for (Moneta m : monety) {
            result += m.liczba * m.nominal;
        }

        return result;

    }

    public double wyzerujAutomat() {
        double stan = this.stan();

        for (Moneta m : monety) {
            m.liczba = 0;
        }
        return stan;
    }

    public void zapiszDoPliku(String nazwaPliku) throws IOException {
        FileWriter fw = null;

        try {
            fw = new FileWriter(nazwaPliku, true);
            fw.write("nominal  liczba   suma");
            fw.write(System.lineSeparator());
            for (Moneta m : monety) {
                String mStr = m.nominal + "       " + m.liczba + "       " + (m.liczba * m.nominal);
                fw.write(mStr);
                fw.write(System.lineSeparator());
            }
        } finally {
            if (fw != null) {
                fw.close();
            }
        }

    }
}
