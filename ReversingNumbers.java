/**
 * Question 5: Reverse Integer
 * Write a program that takes an integer as input and returns an integer with reversed digit 
 * ordering.
 */

 
public class ReversingNumbers {
    
    public static void main(String[] args) {
        // variable to hold the numbeer to be reversed.
        int number = 45923;
        
        System.out.println("The reversed number is " + reverseNumber(number));

    }

    static int reverseNumber(int number) {
        // variable to store the reversed value
        int reversedNum = 0;
        
        // variable to store the remainder.
        int remainderNum;

        while (number > 0) {
            remainderNum = number % 10;
            reversedNum = (reversedNum * 10) + remainderNum;
            number = number / 10;
    }
    return reversedNum;
}
}