import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Initialize variables
        Scanner input = new Scanner(System.in);
        int fizz = 0, buzz = 0;
        int fizzCount = 0, buzzCount = 0;

        // Ask user for the positive number that will represent fizz
        while (fizz <= 0) {
            System.out.print("Input a positive Fizz integer."
            + "\n>> ");
            fizz = input.nextInt();
        }

        // Ask user for the positive number that will represent buzz
        while (buzz <= 0) {
            System.out.print("Input a positive Buzz integer."
            + "\n>> ");
            buzz = input.nextInt();
        }

        // Iterate through numbers 1-100
        for (int i = 1; i <= 100; i++) {

            // If the number is divisible by the fizz number, print Fizz
            if (i % fizz == 0) {
                System.out.print("Fizz ");
                fizzCount++;
            }

            // If the number is divisible by the buzz number, print Buzz
            // This will print "Fizz Buzz" if both of them are divisible
            if (i % buzz == 0) {
                System.out.print("Buzz");
                buzzCount++;
            }

            // If the number is not divisible by either, print just the number
            if (!(i % fizz == 0 || i % buzz == 0)) System.out.print(i);
            // Create a new line for the next input
            System.out.println();
        }
        
        // Display stats to user
        System.out.println("\nNumber of Fizz: " + fizzCount);
        System.out.println("Number of Buzz: " + buzzCount);
    }
}