/**
 * Question 2: Fibonacci Sequence
 * Write a program to generate the Fibonacci sequence up to 100.
 */

public class FibonacciNumbers {
    public static long[] fibNumbers;
    public static void main(String[] args) {
        int fibCount = 100;

        // Compute the values
        fibNumbers = new long[fibCount + 1];

        // Printing all the values in the count requested.
        for(int a = 0; a <= fibCount; a++) {
            System.out.println(fibonacci(a) + " ");
        }
        
    }

    // Method to compute fibonacci numbers
    public static  long fibonacci(int fib) {

        // 1. If fib is less than 1, return;
        if (fib <= 1) {
            return fib;
        }

        if (fibNumbers[fib] != 0) {
            return fibNumbers[fib];
        }

        long nthFibNumber = (fibonacci(fib - 1)) + (fibonacci(fib - 2));
        return nthFibNumber;

    }

    
}
