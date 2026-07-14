package ir.javacup.CanMove;
interface CanFly {

    void fly();

}

interface CanRun {

    void run();

}

class Dog implements CanRun {

    @Override
    public void run() {
        System.out.println("Dog can run.");
    }

}

class Bird implements CanFly {

    @Override
    public void fly() {
        System.out.println("Bird can fly.");
    }

}

class Duck implements CanFly, CanRun {

    @Override
    public void fly() {
        System.out.println("Duck can fly.");
    }

    @Override
    public void run() {
        System.out.println("Duck can run.");
    }

}

public class CanMove {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.run();

        System.out.println("----------------");

        Bird bird = new Bird();

        bird.fly();

        System.out.println("----------------");

        Duck duck = new Duck();

        duck.fly();
        duck.run();

    }

}