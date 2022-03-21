//Import up here
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //initializing scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        //Setting a new string to the user input
        String word = input.nextLine();
        System.out.print("Enter an integer: ");
        //Setting a new int to the user input
        int number = input.nextInt();

        simonSays(word); //Passing word to simonSays

        int inverse = additiveInverse(number); //Assigning the return of what additiveInverse gives to inverse
        System.out.println("Additive inverse of " + number + " is " + inverse);

        finalMessage(); //Calling final message method
    }

    //This method returns nothing, but it prints based on an accepted parameter
    public static void simonSays(String x){
        System.out.println("Simon says " + x);
    }
    
    //This method returns an integer
    public static int additiveInverse(int x){
        return -x; 
    }
    
    //This method returns nothing and accepts no parameters, but it prints a message
    public static void finalMessage(){
        System.out.println("That's all, folks!");
    }
}
