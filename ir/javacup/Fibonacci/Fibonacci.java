package ir.javacup.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 0;
        int F = 0;
        do {
            n++;
            F = fibonacci(n);
            if (F < 1000)
                System.out.println(F);
        } while (F < 1000);
    }

    static int fibonacci(int num) {
		if (num == 0) return 0;
		if (num == 1) return 1;
		return fibonacci(num-1) + fibonacci(num -2) ;
	}
}