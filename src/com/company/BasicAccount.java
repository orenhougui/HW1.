package com.company;

public class BasicAccount extends StandardAccount {

    protected double withdrawLimit;

    public BasicAccount(int accountNumber, double withdrawLimit) {

        super(accountNumber,0);

        this.withdrawlLimit = withdrawlLimit;

    }

@Override
public double Withdraw(double amount) {
        if (amount > withdrawlLimit) {

            balance -= withdrawlLimit;
            return withdrawLimit;
        } else {
            balance -= amount;
            return amount;
        }
}

@Override
public double Withdraw(double amount) {

    if (amount > withdrawlLimit) {

        balance -= withdrawlLimit;
        return withdrawlLimit;
    } else {
        balance -= amount;
        return amount;
    }
}
