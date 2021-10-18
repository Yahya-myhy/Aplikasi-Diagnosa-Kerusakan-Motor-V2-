package com.example.arif.doktor;

public class Kerusakan8 {
    private double g12,g14,g15;
    private double g12Rule, g14Rule, g15Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan8(double g12, double g14, double g15) {
        this.g12 = g12;
        this.g14 = g14;
        this.g15 = g15;

        this.g12Rule = 0.5;
        this.g14Rule = 0.5;
        this.g15Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g12 * this.g12Rule;
        this.cf2 = this.g14 * this.g14Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g15 * this.g15Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
