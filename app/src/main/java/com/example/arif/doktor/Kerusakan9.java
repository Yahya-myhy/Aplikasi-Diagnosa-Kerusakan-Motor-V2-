package com.example.arif.doktor;

public class Kerusakan9 {
    private double g12,g16,g17;
    private double g12Rule, g16Rule, g17Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan9(double g12, double g16, double g17) {
        this.g12 = g12;
        this.g16 = g16;
        this.g17 = g17;

        this.g12Rule = 0.8;
        this.g16Rule = 0.5;
        this.g17Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g12 * this.g12Rule;
        this.cf2 = this.g16 * this.g16Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g17 * this.g17Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
