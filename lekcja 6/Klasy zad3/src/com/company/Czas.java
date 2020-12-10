package com.company;

public class Czas {
    private int godz;
    private int minuty;

    public Czas(int godz, int minuty) {
        this.godz = godz;
        this.minuty = minuty;
        while (this.minuty >= 60) {
            this.minuty -= 60;
            this.godz++;
        }
    }

    public Czas(String czas) {
        char[] timeArray = czas.toCharArray();
        boolean godz = true;

        for (int i = 0; i < timeArray.length; i++) {
            if (Character.isDigit(timeArray[i])) {
                if (godz) {
                    this.godz = this.godz * 10 + Character.getNumericValue(timeArray[i]);
                    if (!Character.isDigit(timeArray[i + 1])) {
                        godz = false;
                    }
                } else {
                    this.minuty = this.minuty * 10 + Character.getNumericValue(timeArray[i]);
                }
            }
        }
        while (this.minuty >= 60) {
            this.minuty -= 60;
            this.godz++;
        }
    }


    @Override
    public String toString() {
        return this.godz + "h" + " " + this.minuty + "min";
    }

    public Czas dodaj(Czas t) {
        int totalHours = this.godz + t.godz;
        int totalMinutes = this.minuty + t.minuty;

        if (totalMinutes >= 60) {
            totalMinutes -= 60;
            totalHours++;
        }
        return new Czas(totalHours, totalMinutes);
    }

    public Czas odejmij(Czas t) {
        int totalHours = this.godz - t.godz;
        int totalMinutes = this.minuty - t.minuty;

        if (totalMinutes < 0) {
            totalMinutes += 60;
            totalHours--;
        }
        return new Czas(totalHours, totalMinutes);
    }

    public Czas pomnoz(int multiplier) {
        int totalHours = this.godz * multiplier;
        int totalMinutes = this.minuty * multiplier;

        while (totalMinutes >= 60) {
            totalMinutes -= 60;
            totalHours++;
        }
        return new Czas(totalHours, totalMinutes);
    }

    static Czas sumuj(Czas[] tab) {
        int totalHours = 0;
        int totalMinutes = 0;
        for (Czas time : tab) {
            totalHours += time.godz;
            totalMinutes += time.minuty;
        }
        while (totalMinutes >= 60) {
            totalMinutes -= 60;
            totalHours++;
        }
        return new Czas(totalHours, totalMinutes);
    }
}
