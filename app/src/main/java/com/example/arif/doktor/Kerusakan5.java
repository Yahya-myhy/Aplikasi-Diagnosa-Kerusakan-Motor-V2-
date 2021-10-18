package com.example.arif.doktor;

public class Kerusakan5 {
    private double g4,g8,g10;
    private double g4Rule, g8Rule, g10Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan5(double g4, double g8, double g10) {
        this.g4 = g4;
        this.g8 = g8;
        this.g10 = g10;

        this.g4Rule = 0.8;
        this.g8Rule = 0.8;
        this.g10Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g4 * this.g4Rule;
        this.cf2 = this.g8 * this.g8Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g10 * this.g10Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
