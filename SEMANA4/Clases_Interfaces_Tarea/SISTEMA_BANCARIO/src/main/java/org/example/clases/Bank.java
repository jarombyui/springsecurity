package org.example.clases;

import org.example.interfaces.Account;

import java.util.List;

import java.util.ArrayList;
public class Bank {
    // atributos para almacenar lista de cuentas
    public List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // metodos
    public void addAccount(Account account) {
        accounts.add(account);

    }

    public List<Account> getAccounts() {
        return accounts;
    }


}
