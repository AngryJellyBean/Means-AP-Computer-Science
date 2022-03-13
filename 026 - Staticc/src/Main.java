import java.util.*;
public class Main {

    static int specialNumber = 5;

    public static void main(String[] args) {
        //Ask the user for an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        //Print the returned value when the user input is passed to fibonacciSpecific
        System.out.println("Digit #" + num + ": " + fibonacciSpecific(num));

        //Call fibonacciAll with the user input
        fibonacciAll(num);

        //Call fibonacciSpecific, passing specialNumber as the parameter. Add the result to what you got when you called fibonacciSpecific earlier. Print the sum.
        System.out.println("\nSpecial Number Sequence: " + fibonacciSpecific(specialNumber));
        int sum = fibonacciSpecific(num) + fibonacciSpecific(specialNumber);
        System.out.println("Sum of your number and special number: " + sum);
        
    }

    //Write fibonacciSpecific Here
	//Without using the actual formula
    public static int fibonacciSpecific(int n) {
        if (n < 0) return -1;
        int a = 0, b = 1, c;

        for (int i = 0; i < n; i++) {
            c = b;
            b = a + b;
            a = c;
        }
        return a;
    }

    //Write fibonacciAll here

    public static void fibonacciAll(int n) {
        //Check if index is invalid
        if (n <= 0) {
            System.out.println("Invalid Index");
            return;
        }
        //Iterate through each number in the fibonacci sequence until we reach the nth digit
        //Where n is the accepted parameter
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciSpecific(i) + ", ");
        }
    }
}
