import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //constructing random number class
        RandomNumber randomNumber = new RandomNumber();
        //calling createNumber method from random
        int random = randomNumber.createNumber();
        
        //asking user for input and assigning it to guess
        System.out.print("Guess a number between 1-10: ");
        int guess = input.nextInt();
        
        //constructing conditions class
        Conditions conditions = new Conditions();
        //calling check method in conditions
        conditions.check(random, guess);

    }

}
