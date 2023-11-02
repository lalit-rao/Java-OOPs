public class BankAccount {
    private String depositorName;
    private long accountNumber;
    private String accountType;
    private double balance;

    // Constructor to initialize the account with initial values
    public BankAccount(String name, long accNumber, String accType, double initialBalance) {
        depositorName = name;
        accountNumber = accNumber;
        accountType = accType;
        balance = initialBalance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount after checking balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display the name and balance
    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Name of Depositor: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create a BankAccount object with initial values
        BankAccount account = new BankAccount("John Doe", 123456789, "Savings", 1000.0);

        // Deposit and withdraw from the account
        account.deposit(500.0);
        account.withdraw(200.0);

        // Display the account information
        account.displayAccountInfo();
    }
}
