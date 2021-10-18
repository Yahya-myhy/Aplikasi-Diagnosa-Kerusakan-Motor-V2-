package com.example.arif.doktor;

public class Kerusakan15 {
    private double g27,g28,g29;
    private double g27Rule, g28Rule, g29Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan15(double g27, double g28, double g29) {
        this.g27 = g27;
        this.g28 = g28;
        this.g29 = g29;

        this.g27Rule = 0.5;
        this.g28Rule = 0.8;
        this.g29Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g27 * this.g27Rule;
        this.cf2 = this.g28 * this.g28Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g29 * this.g29Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
