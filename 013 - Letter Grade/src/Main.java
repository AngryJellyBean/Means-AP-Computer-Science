import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //asking for grade percentage
        System.out.print("Enter your grade percentage: ");
        //assigning inputted value to a new variable
        double grade = input.nextDouble();

        //if statements to check the value of grade, then printing a statement based on the value.
        if (grade >= 90)
            System.out.println("Your letter grade is an A");
        else if (grade >= 80)
            System.out.println("Your letter grade is a B");
        else if (grade >= 70)
            System.out.println("Your letter grade is a C");
        else if (grade >= 60)
            System.out.println("Your letter grade is a D");
        else
            System.out.println("Your letter grade is an F");
    }

}
