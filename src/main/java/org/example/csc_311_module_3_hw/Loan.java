package org.example.csc_311_module_3_hw;

import javafx.application.Application;

// class to get Loan data
public class Loan {

    protected double interest;
    protected int year;
    protected double loanAmount;

    public Loan(double interest, int year, double loanAmount) {

        this.interest = interest;
        this.year = year;
        this.loanAmount = loanAmount;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // setters and getters for monthly and total payment
    public double getMonthlyPayment() {

        double monthlyInterestRate = ((interest / 12) / 100);
        int numMonths = year * 12;

        if (monthlyInterestRate == 0) {
            return loanAmount / numMonths;
        }

        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, - numMonths));

    }

    public double getTotalPayment() {
        return getMonthlyPayment() * year * 12;
    }
}
