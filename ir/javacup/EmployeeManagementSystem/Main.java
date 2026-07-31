package ir.javacup.EmployeeManagementSystem;

import java.util.Scanner;

enum Work {
    FULLTIME,
    PARTTIME,
}

abstract class ManagementSystem {
    private String name;
    private int id;

    public ManagementSystem(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }
}

interface Bonus {
    void calculateBonus();
}

class FullTimeEmployee extends ManagementSystem implements Bonus {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void calculateBonus() {
        double bonus = monthlySalary * 0.10;
        System.out.println("Bonus : " + bonus);
        System.out.println("Total salary with bonus: " + (monthlySalary + bonus));
    }
}

class PartTimeEmployee extends ManagementSystem {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee type (fulltime/parttime): ");
        String type = scanner.nextLine().toLowerCase();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your ID: ");
        int id = scanner.nextInt();

        ManagementSystem employee;

        if (type.equals("fulltime")) {
            System.out.print("Enter monthly salary: ");
            double monthlySalary = scanner.nextDouble();
            employee = new FullTimeEmployee(name, id, monthlySalary);
        } else {
            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            int hoursWorked = scanner.nextInt();
            employee = new PartTimeEmployee(name, id, hourlyRate, hoursWorked);
        }

        System.out.printf("Final salary: %.2f", employee.calculateSalary());
        scanner.close();
    }
}