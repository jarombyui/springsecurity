package org.example.clases;

import org.example.interfaces.Account;
/// verificar si hay algun  metodo mas que se deveria agregar a esta clase
public class CurrentAccount implements Account {
    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public double calcularInterest() {
        return 0;
    }
}
