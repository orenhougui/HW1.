package com.company;


import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{

   List <IAccount> myList = new ArrayList<IAccount>();
   public Bank(int accountNumber, double creditLimit) {
       myList = new ArrayList<IAccount>();
   }


    public void OpenAccount(IAccount account) {
       myList.add(account);
    }


    public ArrayList<Integer> CloseAccount(int accountNumber) {
        if (myList.contains(accountNumber)&&(balance<0)){
        {
                System.out.println("The Account is not close due to debt");

        }
    }

    public List<IAccount> GetAllAccounts() {

            for (int i = 0;i <myList.size();i++);
            myList.get(accountNumber);
            return myList;
        }

    public ArrayList<Integer> GetALlAccountsInDebt() {

            ArrayList<Integer> GetAllAccountsInDebt = new ArrayList<>();

      for (int i= 0; i <myList.size(); i++)
          if (balance < 0);
        boolean add =
GetAllAccountsInDebt.add(accountNumber);
        return GetAllAccountsInDebt;

        }


        public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {

            GetAllAccountsWithBalance = new ArrayList<IAccount>();
    for (int i = 0; i < myList.size();i++)

     if (balanceAbove*2 < balance)

         GetAllAccountsWithBalance.get(accountNumber);
     return GetAllAccountsWithBalance;

    }
}