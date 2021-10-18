package com.example.arif.doktor;

public class Kerusakan3 {
    private double g5,g6, g7;
    private double g5Rule, g6Rule, g7Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan3(double g5, double g6, double g7) {
        this.g5 = g5;
        this.g6 = g6;
        this.g7 = g7;

        this.g5Rule = 0.8;
        this.g6Rule = 0.5;
        this.g7Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g5 * this.g5Rule;
        this.cf2 = this.g6 * this.g6Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g7 * this.g7Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
