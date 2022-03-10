public class Main {
    public static void main(String[] args) {
        //Declaring Two Arrays
        String[] message = {"!", "n", "u", "f", " ", "s", "i", " ", "e", "c", "n", "e", "i", "c", "S", " ", "r", "e", "t", "u", "p", "m", "o", "C"};
        int[] triangularNumbers = new int[10];

        //Create a String by iterating through the message array backwards, and print it to the screen
        //Starting from the top, adding each letter to the "egassem" variable
        String egassem = "";
        for (int  i = message.length-1; i >= 0; i--) egassem += message[i];
        System.out.println(egassem);

        //Fill the triangularNumbers array with the first 10 triangular numbers, starting with the 0th triangular number.
        //Then, print triangularNumbers to the screen.

        //initializing variables
        int bottomLayer = 0;
        int total = 0;
        for(int i = 0; i < 10; i++) {
            triangularNumbers[i] = total + bottomLayer;
            // add the bottom layer to the total for the next iteration
            total += bottomLayer;
            // then add 1 to the bottom layer to use for the next next iteration
            bottomLayer++;
            System.out.println(triangularNumbers[i]);
        }
    }
}
