package com.company;

public class SpecialCheckingAccount extends CheckingAccount{
    private double minBal;
    private double annualRate;


    public SpecialCheckingAccount(int id, double startBal, double cc, double aR, double minnimumBal){
        super(id, startBal, cc);
        minBal = minnimumBal;
        annualRate =aR;
    }
    public void clearCheck(double amount){
        if(currentBalance() >= minBal){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }
    public double monthlyInterest(){
        if(currentBalance()>minBal) {
            return currentBalance() * annualRate / 12;
        }
        return super.monthlyInterest();
        }
    }

