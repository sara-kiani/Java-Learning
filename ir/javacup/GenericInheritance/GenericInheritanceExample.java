package ir.javacup.GenericInheritance;

import java.util.ArrayList;
import java.util.List;

class Animal { }

class Cage<T> extends Animal {
    private T occupant;

    public Cage(T occupant) {
        this.occupant = occupant;
    }

    public T getOccupant() {
        return occupant;
    }
}

class StringList implements List<String> {
    private List<String> list = new ArrayList<>();

    @Override
    public boolean add(String s) {
        return list.add(s);
    }

}

class NumberList<T extends Number> extends ArrayList<T> {
    public double sum() {
        double total = 0;
        for (T num : this) {
            total += num.doubleValue();
        }
        return total;
    }
}

public class GenericInheritanceExample {
    public static void main(String[] args) {
        Cage<String> stringCage = new Cage<>("Sara");
        System.out.println(stringCage.getOccupant());

        NumberList<Integer> numbers = new NumberList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Sum: " + numbers.sum());
    }
}