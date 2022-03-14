import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Initializing variables
        Scanner input = new Scanner(System.in);
        int positives = 0, negatives = 0, sum = 0;
        double average;
        ArrayList<Integer> userInput = new ArrayList<>();

        //Continue adding user input to arraylist until they enter 0
        while (!userInput.contains(0)) {
            System.out.print("Enter an integer: ");
            userInput.add(input.nextInt());
        }

        //Removing the zero at the end of the arraylist
        userInput.remove(userInput.size() - 1);

        //Iterate through the arraylist, adding to the total of
        //positives, negatives, and finally adding the sum
        for (Integer i : userInput) {
            if (i > 0)
                positives++;
            else negatives++;
            sum += i;
        }

        //After sum is calculated, find the average
        average = (double) sum / userInput.size();

        //Print stats to user
        System.out.println("\nPositive Values: " + positives);
        System.out.println("Negative Values: " + negatives);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}