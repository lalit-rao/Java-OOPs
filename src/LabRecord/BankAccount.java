package LabRecord;

public class BankAccount {
    private double balance;

    // Constructor to initialize the account balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.err.println("Initial balance cannot be negative.");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.err.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.err.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display the account balance
    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating a bank account with an initial balance
        BankAccount myAccount = new BankAccount(1000.0);

        // Perform operations on the account
        myAccount.showBalance();
        myAccount.deposit(500.0);
        myAccount.showBalance();
        myAccount.withdraw(200.0);
        myAccount.showBalance();
        myAccount.withdraw(1500.0); // This should display an error message.

        // Final account balance
        myAccount.showBalance();
    }
}