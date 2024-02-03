package org.example;

public enum Month {
    JAN(1, "Январь"),
    FEB(2, 29,"Февраль"),
    MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

    private int numberMonth;
    private int countDay;
    private String ruNameMont;

    Month(int numberMonth, int countDay, String ruNameMont) {
        this.numberMonth = numberMonth;
        this.countDay = countDay;
        this.ruNameMont = ruNameMont;
    }

    Month(int numberMonth, String ruNameMont) {
        this.numberMonth = numberMonth;
        this.ruNameMont = ruNameMont;
    }

    Month() {}

    public int getNumberMonth() {
        return numberMonth;
    }

    public int getCountDay() {
        return countDay;
    }

    public String getRuNameMont() {
        return ruNameMont;
    }
}
