package com.quickcalculator;

public class NSSFCalculator {

    private double netAmount;

    private double nssf;

    private double grossAmount;

    private double rate;

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getNssf() {
        return nssf;
    }

    public void setNssf(double nssf) {
        this.nssf = nssf;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public void calculateNetAmount() {
        this.nssf = 0.05;
        this.netAmount = this.grossAmount / (1 + this.nssf);
        this.nssf = this.grossAmount - this.netAmount;
    }

    public void calculateGrossAmount() {
        this.nssf = 0.18;
        this.nssf = this.netAmount + (this.netAmount * this.nssf);
        this.grossAmount = this.grossAmount + this.nssf;
    }

    public void calculateRate() {
        this.rate = ((this.grossAmount / this.netAmount) - 1);
        this.nssf = this.grossAmount - this.netAmount;
    }

    public double getRate() {
        return rate;
    }

}
