package com.example.arif.doktor;

public class Kerusakan12 {
    private double g19,g22,g23;
    private double g19Rule, g22Rule, g23Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan12(double g19, double g22, double g23) {
        this.g19 = g19;
        this.g22 = g22;
        this.g23 = g23;

        this.g19Rule = 0.8;
        this.g22Rule = 0.8;
        this.g23Rule = 0.5;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g19 * this.g19Rule;
        this.cf2 = this.g22 * this.g22Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g23 * this.g23Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
