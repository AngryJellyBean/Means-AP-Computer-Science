import java.util.Scanner;
public class Digits {

    public static void main(String[] args) {
        //creating scanner
        Scanner input = new Scanner(System.in);

        //prompting user to enter a number
        System.out.println("Enter a 3 digit integer");
        int number = input.nextInt();

        //Using modulus to get the last digit of a number
        int digit = number % 10;
        System.out.println(digit);
        number /= 10;
        digit = number % 10;
        System.out.println(digit);
        number /= 10;
        digit = number % 10;
        System.out.println(digit);
    }

}
