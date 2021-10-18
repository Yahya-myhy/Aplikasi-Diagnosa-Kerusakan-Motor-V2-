package com.example.arif.doktor;

public class Kerusakan10 {
    private double g18,g19;
    private double g18Rule, g19Rule;
    private double cf1, cf2;
    private double cfc1;
    double hasil;

    public Kerusakan10(double g18, double g19) {
        this.g18 = g18;
        this.g19 = g19;

        this.g18Rule = 1.0;
        this.g19Rule = 1.0;

        this.doHitung();
    }
    public void doHitung() {
        this.cf1 = this.g18 * this.g18Rule;
        this.cf2 = this.g19 * this.g19Rule;
        this.cfc1 = this.cf1 + this.cf2 * (1 - this.cf1);

        this.hasil = this.cfc1;
    }
    public double getHasil() {

        return this.hasil;
    }
}
