package org.example.class10;

public class BankUserTester {
    public static void main(String[] args) {
        BankUser user1 = new BankUser();
        user1.lastname = "Doe";
        user1.firstname = "John";
        user1.creditBalance = 2345;
        user1.debitBalance = -35;
        user1.printUser();
        user1.printBalance();
    }
}
