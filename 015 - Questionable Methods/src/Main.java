import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asking user for an input
        System.out.print("Input a string: ");
        //Assigning inputted line to a new variable
        String line = input.nextLine();

        //Printing the returned values of question mark functions
        System.out.print(findQuestionMark(line) + ", "
            + removeQuestionMark(line));
    }
     
    public static int findQuestionMark(String word){
        //Returning the index of "?" from the accepted string
        return word.indexOf("?");
    }

    public static String removeQuestionMark(String word){
        //Assigning the returned value of findQuestionMark to index
        int index = findQuestionMark(word);

        //If there is a question mark, we proceed with removing it.
        if (index > -1)
            word = word.substring(0, index) + word.substring(index+1);
        //Returning final result after removing question mark (if found)
        return word;
    }
}