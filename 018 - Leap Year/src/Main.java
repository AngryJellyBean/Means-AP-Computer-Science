import java.util.Scanner;

public class Main {
    static boolean isLeapYear(int i) {
        //If input is divisible by 4, but not divisible by 100, return true.
        if ((i % 4 == 0) && (i % 100 != 0)) return true;

        //If input is divisible by 100, it must also be divisible by 400 to be a leap year.
        else if ((i % 100 == 0) && (i % 400 == 0)) return true;

        //In any other situation, it is not a leap year.
        else return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask for input and store input in new variable
        System.out.print("Enter a year: ");
        int year = (int) input.nextDouble();

        //If year is a leap year, prompt indicates valid year
        //Leap years weren't a thing until after 1582, so check for this first.
        if (year <= 1582) System.out.println("Invalid year.");
        else if (isLeapYear(year)) System.out.println(year + " is a leap year.");
        //Otherwise, indicate not leap year year.
        else System.out.println(year + " is not a leap year.");
    }
}