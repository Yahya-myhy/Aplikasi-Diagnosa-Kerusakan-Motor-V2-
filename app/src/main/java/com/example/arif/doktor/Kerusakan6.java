package com.example.arif.doktor;

public class Kerusakan6 {
    private double g4,g5,g11;
    private double g4Rule, g5Rule, g11Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan6(double g4, double g5, double g11) {
        this.g4 = g4;
        this.g5 = g5;
        this.g11 = g11;

        this.g4Rule = 0.5;
        this.g5Rule = 0.8;
        this.g11Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g4 * this.g4Rule;
        this.cf2 = this.g5 * this.g5Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g11 * this.g11Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
