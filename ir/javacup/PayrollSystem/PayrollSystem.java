package ir.javacup.PayrollSystem;

abstract class Employee {
    protected String name;
    protected String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{name='" + name + "', employeeId='" + employeeId + "'}";
    }
}

interface Payable {
    double calculateSalary();
}

class FullTimeEmployee extends Employee implements Payable {
    private double monthlySalary;

    public FullTimeEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{name='" + name + "', employeeId='" + employeeId + "', monthlySalary=" + monthlySalary + "}";
    }
}

class PartTimeEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{name='" + name + "', employeeId='" + employeeId + "', hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + "}";
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", "E001", 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", "E002", 20, 80);

        System.out.println(emp1);
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println(emp2);
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}