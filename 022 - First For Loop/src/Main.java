import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smaller, larger;

        //Ask user for an integer
        System.out.print("Enter an integer: ");
        smaller = input.nextInt();

        //Ask user for larger integer
        System.out.print("Enter a larger integer: ");
        larger = input.nextInt();

        //Iterate through every number between the 2 integers (inclusive)
        for (int i = smaller; i <= larger; i++)
            //If i doesn't divide by 2 evenly, it must be odd. Print i
            if (i % 2 != 0)
                System.out.println(i);
    }
}
