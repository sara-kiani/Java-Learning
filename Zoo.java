abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void eat() {
        System.out.println(name + " is eating.");
    }
}
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    void run() {
        System.out.println(name + " is running.");
    }
}
class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    void climb() {
        System.out.println(name + " is climbing.");
    }
}
class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }

    void fly() {
        System.out.println(name + " is flying.");
    }
}
public class Zoo {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Rocky"),
                new Cat("Milo"),
                new Bird("Rio")
        };

        for (Animal animal : animals) {

            animal.makeSound();
            animal.eat();

            if (animal instanceof Dog dog) {
                dog.run();
            }

            if (animal instanceof Cat cat) {
                cat.climb();
            }

            if (animal instanceof Bird bird) {
                bird.fly();
            }

            System.out.println("----------------");
        }
    }
}