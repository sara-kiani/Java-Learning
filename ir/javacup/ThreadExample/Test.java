package ir.javacup.ThreadExample;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Threadproject("first Thread") );
        Thread t2 = new Thread(new Threadproject("second Thread") );
        Thread t3 = new Thread(new Threadproject("third Thread") );
        Thread t4 = new Thread(new Threadproject("forth Thread") );

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
    
}
