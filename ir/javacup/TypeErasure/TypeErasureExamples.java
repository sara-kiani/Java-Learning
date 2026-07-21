package ir.javacup.TypeErasure;

import java.util.ArrayList;

class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class Calculator<T extends Number> {

    public double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }
}

class Example<T> {

    // این‌ها خطای کامپایل می‌دهند:

    // T object = new T();

    // T[] array = new T[10];

    // if (object instanceof T) {}

}

public class TypeErasureExamples {

    public static void main(String[] args) {

        // مثال اول: Type Erasure

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(
                list1.getClass() == list2.getClass()
        );

        System.out.println("----------------");

        // مثال دوم: Generic ساده

        Box<String> box = new Box<>();

        box.set("Sara");

        System.out.println(box.get());

        System.out.println("----------------");

        // مثال سوم: Generic با محدودیت

        Calculator<Integer> calculator =
                new Calculator<>();

        System.out.println(
                calculator.square(5)
        );
    }
}