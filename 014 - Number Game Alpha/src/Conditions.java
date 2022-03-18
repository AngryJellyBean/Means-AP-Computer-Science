public class Conditions {
    public static void check(int random, int guess) {

        //conditions to check and print a statement
        if (guess < 1 || guess > 10) {
            System.out.println("That number is not allowed! You lose!");
        } else if (guess == random) {
            System.out.println("Congratulations! " + guess + " was the right number! you win!");
        } else if (guess > random) {
            System.out.println("Your guess was too high! The number was " + random + ". You lose!");
        } else {
            System.out.println("Your guess was too low! The number was " + random + ". You lose!"); 
        }
    }
}