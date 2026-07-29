package ir.javacup.Car;

public class Car {
    private String brand;
    private String model;
    private String year;

    public Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public String getYear() { return year; }

    public static void main(String[] args) {
        Car mycar = new Car("BMW", "M5", "2024");
        Car mycar1 = new Car("Toyota", "Land Cruiser", "2026");

        System.out.println(mycar.getBrand() + "  " + mycar.getModel() + " " + mycar.getYear());
        System.out.println("----------------------------------");
        System.out.println(mycar1.getBrand() + "  " + mycar1.getModel() + " " + mycar1.getYear());
    }
}