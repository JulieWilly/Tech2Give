import java.util.Scanner;

// Question 3: Power of Two
// Write a program that takes an integer as input and returns true if the input is a power of two.

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean is_of_power_of_two = false;
        
        System.out.println("Please enter a number to confirm if it is a power of two."); 
        int number = sc.nextInt();

        if (isNumPowerOfTwo(number)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static boolean isNumPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
 
        return (Math.ceil((Math.log(n) / Math.log(2)))) == (Math.floor(
                ((Math.log(n) / Math.log(2)))));
    }
 
}
