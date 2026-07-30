package ir.javacup.ShapeManager;

abstract class Shapes{
    int width ;
    int height ;
    //constractor
    Shapes(int width , int height){
        this.width = width ;
        this.height = height ;
    }
    //method abstarct
    abstract double Area();

    //Concrete method
    void getWidth(){
        System.out.println("width" + width);
    }

    void getHeight(){
        System.out.println("height" + height);
    }

}
class Rectangle extends Shapes{
    Rectangle(int width, int height){
        super(width, height);
    }
    double Area(){
        return width *height ;
    }

}

class Circle extends Shapes {
    int radius;

    Circle(int radius) {
        super(0, 0); 
        this.radius = radius;
    }

    @Override
    double Area() {
        return 3.14 * radius * radius;
    }
}
public class ShapeManager{
    public static void main(String[] args) {
        Shapes s = new Rectangle(50, 100);
        s.getWidth();
        s.getHeight();
        System.out.println("Area" + s.Area());
        System.out.println("-----------------------------------------------------");

        Circle c = new Circle(12);
        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.Area());
        
    }
}