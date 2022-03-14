import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generate random number, store it in rand
        int rand = (int) (Math.random() * 10 + 1);

        // Initialize guess and count variables
        int guess, count = 0;
        
            /*\
             *  go through the following loop once regardless of condition,
             *  then only continue to loop if the condition returns true.
             *  (while the user hasn't guessed correctly)
            \*/

        do {
            // Prompt user to guess a number, insert their answer into guess variable
            System.out.print("Guess a number between 1-10: ");
            guess = (int) input.nextDouble();

            // Add 1 to count of tries after user input
            count++;

            // Keep user in a loop until guess is within the acceptable range.
            while (guess < 1 || guess > 10) {
                System.out.println("\nYour guess was out of the acceptable range! Try again.");
                System.out.print("Guess a number between 1-10: ");
                guess = (int) input.nextDouble();
            }

            // If guess is lower than the generated number, prompt user to try again
            if (guess < rand)
                System.out.println("\nYour guess was too low. Try again.");
            
            // If guess is higher than the generated number, prompt user to try again
            else if (guess > rand)
                System.out.println("\nYour guess was too high. Try again.");
            
            // Guess can only be correct now; tell the user they are correct
            else
                System.out.println("\nYou got it right! The number was " + rand 
                    + ".\nIt took you " + count + " tries to guess it.");
        } while (guess != rand);
    }
}