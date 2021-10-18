package com.example.arif.doktor;

public class Kerusakan4 {
    private double g2,g8,g9,g10;
    private double g2Rule, g8Rule, g9Rule, g10rule;
    private double cf1, cf2, cf3, cf4;
    private double cfc1, cfc2, cfc3;
    double hasil;

    public Kerusakan4(double g2, double g8, double g9, double g10) {
        this.g2 = g2;
        this.g8 = g8;
        this.g9 = g9;
        this.g10 = g10;

        this.g2Rule = 0.8;
        this.g8Rule = 0.8;
        this.g9Rule = 0.8;
        this.g10rule = 0.5;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g2 * this.g2Rule;
        this.cf2 = this.g8 * this.g8Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g9 * this.g9Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.cf4 = this.g10 * this.g10rule;
        this.cfc3 = this.cfc2 + this.cf4 * (1 - this.cfc2);

        this.hasil = this.cfc3;
    }
    public double getHasil() {

        return this.hasil;
    }
}
