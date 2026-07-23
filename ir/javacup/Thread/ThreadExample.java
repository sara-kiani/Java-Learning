package ir.javacup.Thread;

class Number implements Runnable {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number " + number + " is running by " +
                Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Number(1));
        Thread t2 = new Thread(new Number(2));
        Thread t3 = new Thread(new Number(3));

        t1.start();
        t2.start();
        t3.start();
    }
}