package com.company;

import java.util.ArrayList;
import java.util.List;

public interface IBank {
    void OpenAccount(IAccount account);
    ArrayList<Integer> CloseAccount(int accountNumber);
    List<IAccount> GetAllAccounts();
    List<IAccount> GetAllAccountsInDebt();
    List<IAccount> GetAllAccountsWithBalance(double balanceAbove);

}
