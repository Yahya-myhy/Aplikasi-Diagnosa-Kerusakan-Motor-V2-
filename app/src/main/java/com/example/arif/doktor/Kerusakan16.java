package com.example.arif.doktor;

public class Kerusakan16 {
    private double g30,g31;
    private double g30Rule, g31Rule;
    private double cf1, cf2;
    private double cfc1;
    double hasil;

    public Kerusakan16 (double g30, double g31) {
        this.g30 = g30;
        this.g31 = g31;

        this.g30Rule = 0.8;
        this.g31Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g30 * this.g30Rule;
        this.cf2 = this.g31 * this.g31Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.hasil = this.cfc1;
    }
    public double getHasil() {

        return this.hasil;
    }
}
