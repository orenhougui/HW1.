package com.company;

public class StandardAccount implements IAccount {

    protected int accountNumber;
    protected double creditLimit;
    protected double balance;


    Public standardAccount(int accountNumber,double creditLimit) {

        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.balance = 0;


        return null;
    }

@Override
public void Deposit(double amount) {
        //if (amount > creditLimit):

    balance += amount;
}

@Override
public double Withdraw(double amount) {
        if ((amount < creditLimit) && (amount <= balance)){

            balance -= creditLimit;
                    return balance;

        } else if (balance == creditLimit) {
            return 0;

        } else {

            balance -= creditLimit;
                return balance;
        }
}

@Override
public double GetCurrentBalance() {
    return balance;
        }


public int GetAccountNumber() {
    return accountNumber;
        }

}





