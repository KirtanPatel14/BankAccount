package com.company;

public class SavingsAccount extends Account {

    private double interestrate;

    public SavingsAccount(int id, double balance, double interest){
        super(id,balance);
        interestrate = interest;
    }


    public double monthlyInterest(){
         return currentBalance() * (interestrate/12);
    }

    public void withdraw(double amount){
        if(currentBalance()>= amount){
            decreaseBalance(amount);
        }
    }
}
