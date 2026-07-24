package ir.javacup.Runner;


public class Main {
    public static void main(String[] args) {
        Thread runner1 = new Thread(new Runner("Runner 1"));
        Thread runner2 = new Thread(new Runner("Runner 2"));
        Thread runner3 = new Thread(new Runner("Runner 3"));

        System.out.println("Race started!");

        runner1.start();
        runner2.start();
        runner3.start();

        try {
            runner1.join();
            runner2.join();
            runner3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("Race finished!");
    }
}
    

