package com.example.arif.doktor;

public class Kerusakan13 {
    private double g22,g24;
    private double g22Rule, g24Rule;
    private double cf1, cf2;
    private double cfc1;
    double hasil;

    public Kerusakan13(double g22, double g24) {
        this.g22 = g22;
        this.g24 = g24;

        this.g22Rule = 1.0;
        this.g24Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g22 * this.g22Rule;
        this.cf2 = this.g24 * this.g24Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.hasil = this.cfc1;
    }
    public double getHasil() {

        return this.hasil;
    }
}
