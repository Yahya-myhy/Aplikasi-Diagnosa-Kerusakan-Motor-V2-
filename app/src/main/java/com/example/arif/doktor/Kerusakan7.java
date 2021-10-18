package com.example.arif.doktor;

public class Kerusakan7 {
    private double g12,g13,g14;
    private double g12Rule, g13Rule, g14Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan7(double g12, double g13, double g14) {
        this.g12 = g12;
        this.g13 = g13;
        this.g14 = g14;

        this.g12Rule = 0.3;
        this.g13Rule = 0.8;
        this.g14Rule = 0.5;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g12 * this.g12Rule;
        this.cf2 = this.g13 * this.g13Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g14 * this.g14Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
