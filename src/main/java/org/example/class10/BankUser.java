package org.example.class10;

public class BankUser {
    String firstname;
    String lastname;
    double debitBalance;
    double creditBalance;

    void printBalance() {
        System.out.println("Your debit balance is: " + debitBalance);
        System.out.println("Your credit balance is: " + creditBalance);
    }

    void printUser() {
        System.out.println("Hello, " + firstname + " " + lastname);
    }
}
