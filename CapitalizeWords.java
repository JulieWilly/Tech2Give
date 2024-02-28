import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Question 4: Capitalize Words
 * Write a program that accepts a string as input, capitalizes the first letter of each word in the 
 * string, and then returns the result string. 
 */
public class CapitalizeWords {
    private static String chars;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        
        String myinput = "this test by tech2give is amazing and mind bowing";
        // store each character to a char array
        char[] charAray = myinput.toCharArray();

        System.out.println("Before capitalizing: " + myinput);

        CapitalizeWords capWord = new CapitalizeWords();
        capWord.capitalize(charAray);

         // converting the character array to the string
         myinput = String.valueOf(charAray);

         // to print the final result
         System.out.println("After capitalizing the first letter: " + myinput);

    }

    public void capitalize(char[] charAray) {
           // for loop to capitalize first letter 
           for(int i = 0; i < charAray.length; i++) {

              // capitalizing first letter of first word
              charAray[0] = Character.toUpperCase(charAray[0]);

              // loop to check if there is space between two letters
              if(charAray[i] == ' ') {
                 // capitalizing first letter of rest of the word
                 charAray[i+1] = Character.toUpperCase(charAray[i+1]);
              }
           }
        }
    }
     
