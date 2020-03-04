package homework29022020;

/*
Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class JP9 {

    public static void main(String[] args) {
        fibonacciNumbers();
    }

    public static void fibonacciNumbers() {
        int a = 1;
        int b = 1;
        System.out.println("Fibonnaci Numbers: ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(" "+ a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

}

