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
        this.rate = 0.05;
        this.nssf = this.grossAmount*this.rate;
        this.netAmount = this.grossAmount-this.nssf;
        this.nssf = this.grossAmount - this.netAmount;
    }

    public void calculateGrossAmount() {
        this.rate = 0.05;
        this.grossAmount = this.nssf / this.rate;
        this.netAmount = this.grossAmount*this.rate;
    }

    public void calculateRate() {
        this.rate = ((this.grossAmount / this.netAmount) - 1);
        this.nssf = this.grossAmount - this.netAmount;
    }
    public  void calculateNssf(){
        this.rate=0.05;
        this.nssf = this.grossAmount*this.rate;
        this.netAmount = this.grossAmount-this.nssf;
    }

    public double getRate() {
        return rate;
    }

}
