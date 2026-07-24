package ir.javacup.Runner;
import java.util.Random;

public class Runner implements Runnable {
    private String name;
    private int speed;

    public Runner(String name) {
        this.name = name;
        Random random = new Random();
        this.speed = random.nextInt(401) + 100; 
    }

    public void run() {
        try {
            for (int step = 1; step <= 5; step++) {
                System.out.println(name + " - Step " + step + " (speed: " + speed + "ms)");
                Thread.sleep(speed);
            }
            System.out.println(name + " finished!");
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted!");
        }
    }
}