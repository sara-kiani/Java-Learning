package ir.javacup.BankAccount;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.err.println("Error: Balance cannot be negative!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 || amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, 500.0);
        System.out.println("Initial Balance: " + acc1.getBalance());

        acc1.deposit(200);
        System.out.println("After Deposit: " + acc1.getBalance());

        acc1.withdraw(100);
        System.out.println("After Withdraw: " + acc1.getBalance());

        acc1.withdraw(700);
        System.out.println("Final Balance: " + acc1.getBalance());
    }
}