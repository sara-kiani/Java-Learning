package ir.javacup.PaymentSystem;

import java.util.Scanner;

enum Payment {
    CASH, CREDIT
}

abstract class PaymentSystem {
    private double amount;

    public PaymentSystem(double amount) {
        this.amount = amount;
    }

    abstract double calculateFinalAmount();

    double getAmount() {
        return amount;
    }
}

interface Discountable {
    void applyDiscount();
}

class CashPayment extends PaymentSystem {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        return getAmount();
    }
}

class CreditPayment extends PaymentSystem implements Discountable {
    public CreditPayment(double amount) {
        super(amount);
    }

    @Override
    double calculateFinalAmount() {
        return getAmount() * 0.90;
    }

    @Override
    public void applyDiscount() {
        System.out.println("10% discount applied.");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment type (CASH/CREDIT): ");
        String type = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentSystem payment;
        if (type.equals("CASH")) {
            payment = new CashPayment(amount);
        } else {
            payment = new CreditPayment(amount);
        }

        System.out.println("Final amount: " + payment.calculateFinalAmount());
        scanner.close();
    }
}