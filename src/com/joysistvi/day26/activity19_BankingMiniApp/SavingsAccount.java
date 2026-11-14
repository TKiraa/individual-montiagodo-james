package com.joysistvi.day26.activity19_BankingMiniApp;

public class SavingsAccount extends Account implements Transaction, Transferable, InterestBearing{

    public static final double MIN_BALANCE = 500.0;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void displayAccountInfo() {
        System.out.println(toString());
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
        System.out.println("Min Balance: " + MIN_BALANCE);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + ". New Balance: " + getBalance());
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
            return false;
        }
        if (getBalance() - amount < MIN_BALANCE ) {
            System.out.println("Withdrawal failed: balance cannot go below " + MIN_BALANCE);
            return false;
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrew " + amount + ". New balance: " + getBalance());
        return true;
    }

    @Override
    public boolean transfer(Transaction target, double amount) {
        System.out.println("Transferring " + amount + "...");
        if (withdraw(amount)){
            target.deposit(amount);
            System.out.println("Transfer succesful.");
            return true;
        }
        System.out.println("Transfer failed.");
        return false;
    }

    @Override
    public void addInterest() {
        double interest = getBalance() * (INTEREST_RATE / 100);
        setBalance(getBalance() + interest);
        System.out.println("Interest added. " + interest + ". New balance: " + getBalance());
    }

    public void deposit(double amount, String remarks) {
        deposit(amount);
        System.out.println("Remarks: " + remarks);
        return;
    }

    public boolean withdraw(double amount, String remarks) {
        boolean result = withdraw(amount);
        System.out.println("Remarks: " + remarks);
        return result;
    }
}
