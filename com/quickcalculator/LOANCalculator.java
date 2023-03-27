package com.quickcalculator;

public class LOANCalculator {
    private double amountToBeBorrowed;
    private double interestToBePaidPerDay;
    private double interestToBePaidPerWeek;
    private double interestToBePaidPerMonth;
    private double interestToBePaidPerYear;
    private double ratePerMonth;

    //get and set amountToBorrowed
    public double getAmountToBeBorrowed() {
        return amountToBeBorrowed;
    }

    public void setAmountToBeBorrowed(double amountToBeBorrowed) {
        this.amountToBeBorrowed = amountToBeBorrowed;
    }
    //get and set ratePerMonthPercentage

    //get and set amountToBePaidPerDay
    public double getInterestToBePaidPerDay() {
        return interestToBePaidPerDay;
    }

    public void setInterestToBePaidPerDay(double interestToBePaidPerDay) {
        this.interestToBePaidPerDay = interestToBePaidPerDay;
    }

    //get and set amountToBePaidPerWeek
    public double getInterestToBePaidPerWeek() {
        return interestToBePaidPerWeek;
    }

    public void setInterestToBePaidPerWeek(double interestToBePaidPerWeek) {
        this.interestToBePaidPerWeek = interestToBePaidPerWeek;
    }

    //get and set amountToBePaidPerMonth

    public double getInterestToBePaidPerMonth(){
        return interestToBePaidPerMonth;
    }
    public void setInterestToBePaidPerMonth(double interestToBePaidPerMonth){
        this.interestToBePaidPerMonth = interestToBePaidPerMonth;
    }

    //get and set amountToBePaidPerYear
    public double getInterestToBePaidPerYear(){
        return interestToBePaidPerYear;
    }
    public void setInterestToBePaidPerYear(double interestToBePaidPerYear){
        this.interestToBePaidPerYear = interestToBePaidPerYear;
    }

    //get and set ratePerMonth
    public double getRatePerMonth(){
        return ratePerMonth;
    }
    public void setRatePerMonth(double ratePerMonth){
        this.ratePerMonth = ratePerMonth;
    }


    //done with getters and setters and moving on to calculations

    //calculating interest per month
    public void calculateInterestToBePaidPerMonth() {
        this.interestToBePaidPerMonth = (this.ratePerMonth/100)*this.amountToBeBorrowed;
        this.interestToBePaidPerDay = (((this.ratePerMonth/100)*this.amountToBeBorrowed)/30);
        this.interestToBePaidPerWeek = (this.interestToBePaidPerDay*7);
        this.interestToBePaidPerYear = (this.interestToBePaidPerMonth*12);

    }
    //calculating interest per day

    public void calculateInterestToBePaidPerDay() {
        this.interestToBePaidPerMonth = (this.ratePerMonth/100)*this.amountToBeBorrowed;
        this.interestToBePaidPerDay = (((this.ratePerMonth/100)*this.amountToBeBorrowed)/30);
        this.interestToBePaidPerWeek = (this.interestToBePaidPerDay*7);
        this.interestToBePaidPerYear = (this.interestToBePaidPerMonth*12);
    }
    //calculating interest per week

    public void calculateInterestToBePaidPerWeek() {
        this.interestToBePaidPerMonth = (this.ratePerMonth/100)*this.amountToBeBorrowed;
        this.interestToBePaidPerDay = (((this.ratePerMonth/100)*this.amountToBeBorrowed)/30);
        this.interestToBePaidPerWeek = (this.interestToBePaidPerDay*7);
        this.interestToBePaidPerYear = (this.interestToBePaidPerMonth*12);
    }
    //calculating interest per Year
    public void calculateInterestToBePaidPerYear(){
        this.interestToBePaidPerMonth = (this.ratePerMonth/100)*this.amountToBeBorrowed;
        this.interestToBePaidPerDay = (((this.ratePerMonth/100)*this.amountToBeBorrowed)/30);
        this.interestToBePaidPerWeek = (this.interestToBePaidPerDay*7);
        this.interestToBePaidPerYear = (this.interestToBePaidPerMonth*12);
    }
    //calculating rate per month
    public void calculateRatePerMonth(){
        this.interestToBePaidPerDay = (((this.ratePerMonth/100)*this.amountToBeBorrowed)/30);
        this.interestToBePaidPerWeek = (this.interestToBePaidPerDay*7);
        this.interestToBePaidPerYear = (this.interestToBePaidPerMonth*12);
        this.ratePerMonth = this.interestToBePaidPerMonth/this.amountToBeBorrowed;
    }
    //calculate amount to be borrowed
    public void calculateAmountToBeBorrowed(){
        this.interestToBePaidPerDay = (((this.ratePerMonth/100)*this.amountToBeBorrowed)/30);
        this.interestToBePaidPerWeek = (this.interestToBePaidPerDay*7);
        this.interestToBePaidPerYear = (this.interestToBePaidPerMonth*12);
        this.amountToBeBorrowed = ((this.ratePerMonth/100)*this.amountToBeBorrowed)/(this.ratePerMonth/100);
    }

}
