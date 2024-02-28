import java.util.Scanner;

/**
 * Question 6: Count Vowels
 * Write a program that counts the number of vowels in a sentence.
 */
public class VowelsCount {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int countVowels = 0;
        System.out.println("Enter a word or a sentence to count the number of vowels in it...");
        String word = sc.nextLine();

        for (int a = 0;a < word.length(); a++) {
                char ch = word.charAt(a);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                }
        }

        System.out.println("The number of vowels in the word/sentence is: " + countVowels);
    }
}
