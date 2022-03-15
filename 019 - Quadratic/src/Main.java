import java.util.Scanner;
public class Main {
    public static void printFormula() {
        //This whole method is totally cosmetic. I thought it looked cool.
        for (int i = 0; i < 500; i++) System.out.println();
        System.out.println("Quadratic Formula\n");
        System.out.println("          ______");
        System.out.println("    -b ± √b²-4ac");
        System.out.println("x = -------------");
        System.out.println("         2a");
    }

    public static void evaluate(double a, double b, double c) {
        //Evaluate discriminant and assign it to discrim variable
        double discrim = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        System.out.println("\nEvaluation: ");

        //if discriminant is greater than 0, there are 2 evaluations, find those
        if (discrim > 0) {
            System.out.println("x = " + ((-b + discrim) / (2 * a)));
            System.out.println("x = " + ((-b - discrim) / (2 * a)));
        } 
        //if discriminant is 0, ignore it and proceed with the rest of the equation
        else if (discrim == 0) 
            System.out.println("x = " + (-b / (2 * a)));
        //otherwise, no real roots could exist
        else
            System.out.println("There are no real roots.");
        
        System.out.print("\nWhen a = " + a + ", b = " + b + ", and c = " + c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare and input coefficients

        printFormula();
        System.out.print("\nEnter a: ");
        double a = input.nextDouble();

        printFormula();
        System.out.print("\nEnter b: ");
        double b = input.nextDouble();

        printFormula();
        System.out.print("\nEnter c: ");
        double c = input.nextDouble();

        //Evaluate equation
        printFormula();
        evaluate(a, b, c);
    }
}
