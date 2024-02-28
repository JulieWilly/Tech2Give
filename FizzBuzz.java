/*
 * Question 1: FizzBuzz
 * Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for 
 * multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print 
 * "FizzBuzz". 
 */

public class FizzBuzz {

    public static void main(String[] args) {
        int count = 100;
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(count);
    }

    public void fizzBuzz(int n) {
        for(int i = 0; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");                
            } else if (i % 3 == 0) {
                System.out.println("Fizz");                
            }
            else {
                System.out.println(i);
            }
        }
    }
}