import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Generating 2 numbers between 1 and 12
		int num1 = (int) (Math.random() * 12 + 1);
		int num2 = (int) (Math.random() * 12 + 1);
		int prod = num1 * num2;
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the user and store their answer
		System.out.print("Solve this problem: " + num1 + " x " + num2 + " = ");
		int userInput = input.nextInt();
		
		// Perform checks
		if (userInput == prod)
			System.out.println("Correct!");
		else
			System.out.println("Wrong");
	}
}