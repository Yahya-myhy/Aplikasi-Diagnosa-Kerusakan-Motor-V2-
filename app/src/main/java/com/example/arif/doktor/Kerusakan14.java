package com.example.arif.doktor;

public class Kerusakan14 {
    private double g25,g26,g27;
    private double g25Rule, g26Rule, g27Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan14 (double g25, double g26, double g27) {
        this.g25 = g25;
        this.g26 = g26;
        this.g27 = g27;

        this.g25Rule = 0.8;
        this.g26Rule = 0.8;
        this.g27Rule = 0.5;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g25 * this.g25Rule;
        this.cf2 = this.g26 * this.g26Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g27 * this.g27Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
