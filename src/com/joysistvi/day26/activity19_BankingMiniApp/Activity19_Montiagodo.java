package com.joysistvi.day26.activity19_BankingMiniApp;

public class Activity19_Montiagodo {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("1001", "James Genotiva Montiagodo", 5000.0);
        CheckingAccount checkingAccount = new CheckingAccount("2001", "Nobody Tan", 1000.0);

        System.out.println("\n=== Savings Account ===");
        testAccount(savingsAccount);

        System.out.println("\n=== Checking Account ===");
        testAccount(checkingAccount);

        System.out.println("\n=== Savings Transactions ===");
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(5800);
        savingsAccount.deposit(500, "Birthday gift");
        savingsAccount.withdraw(1500, "Rent");

        System.out.println("\n=== Checking Transactions ===");
        checkingAccount.withdraw(2500);
        checkingAccount.withdraw(1000);

        System.out.println("\n=== Transfer (Savings to Checking) ===");
        savingsAccount.transfer(checkingAccount, 1000);

        System.out.println("\n=== Interest ===");
        savingsAccount.addInterest();
    }

    public static void testAccount(Account account) {
        account.displayAccountInfo();
    }
}

/*
    OOP CONCEPTS USED
    Encapsulation: Account class (private accountNumber, accountHolder, and balance; getters and protected setBalance();).
    Inheritance: SavingsAccount and CheckingAccount extend the Account class and call super(...) in their constructors.
    Polymorphism (overriding): displayAccountInfo(), deposit(), withdraw(), and transfer() are overridden in SavingsAccount and CheckingAccount.
    Polymorphism (overloading): deposit(double amount, String remarks) and withdraw(double amount, String remarks) in SavingsAccount.
    Abstraction (abstract class): Account with abstract displayAccountInfo()
    Abstraction (interfaces): Transaction, Transferable, InterestBearing, and Overdraftable are implemented by the account classes.
    Constants: INTEREST_RATE in InterestBearing, OVERDRAFT_LIMIT in Overdraftable, and MIN_BALANCE in SavingsAccount.
 */
