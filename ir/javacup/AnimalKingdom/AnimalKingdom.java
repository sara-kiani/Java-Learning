package ir.javacup.AnimalKingdom;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String sound();

    @Override
    public String toString() {
        return "Animal{name='" + name + "', sound='" + sound() + "'}";
    }
}

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

interface CanRun {
    void run();
}

class Dog extends Animal implements CanRun {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Woof";
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }
}

class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Chirp";
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class Fish extends Animal implements CanSwim {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "...";
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

class Duck extends Animal implements CanFly, CanRun, CanSwim {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Quack";
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

public class AnimalKingdom {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Buddy");
        animals[1] = new Bird("Tweety");
        animals[2] = new Fish("Nemo");
        animals[3] = new Duck("Donald");

        for (Animal animal : animals) {
            System.out.println(animal);
            if (animal instanceof CanFly) {
                ((CanFly) animal).fly();
            }
            if (animal instanceof CanRun) {
                ((CanRun) animal).run();
            }
            if (animal instanceof CanSwim) {
                ((CanSwim) animal).swim();
            }
            System.out.println();
        }
    }
}