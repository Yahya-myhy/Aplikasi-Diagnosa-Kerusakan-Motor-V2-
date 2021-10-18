package com.example.arif.doktor;

public class Kerusakan2 {
    private double g1,g3, g4;
    private double g1Rule, g3Rule, g4Rule;
    private double cf1, cf2, cf3;
    private double cfc1, cfc2;
    double hasil;

    public Kerusakan2(double g1, double g3, double g4) {
        this.g1 = g1;
        this.g3 = g3;
        this.g4 = g4;

        this.g1Rule = 0.5;
        this.g3Rule = 0.8;
        this.g4Rule = 0.8;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g1 * this.g1Rule;
        this.cf2 = this.g3 * this.g3Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.cf3 = this.g4 * this.g4Rule;
        this.cfc2 = this.cfc1 + this.cf3 * (1 - this.cfc1);

        this.hasil = this.cfc2;
    }
    public double getHasil() {

        return this.hasil;
    }
}
