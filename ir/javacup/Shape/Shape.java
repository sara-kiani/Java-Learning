package ir.javacup.Shape;

abstract class Shapes {
    String color;

    Shapes(String color) {
        this.color = color;
    }

    abstract double area();

    void getColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shapes {
    int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Shape {
    public static void main(String[] args) {
        Shapes s = new Circle("Red", 5);
        s.getColor();
        System.out.println("Area: " + s.area());
    }
}