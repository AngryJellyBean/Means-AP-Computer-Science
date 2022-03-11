import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Testing stuff
        GameSpinner g = new GameSpinner(4);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <=10; i++) {
            System.out.println("Spin: " + g.spin());
            System.out.println("Run: " + g.currentRun());
        }


        HiddenWord puzzle = new HiddenWord("TRAIN");
        String word = "PLACEHOLDER";
        while (!word.equals(puzzle.getHint(word))) {
            System.out.println("Guess 5 letter word:");
            word = input.nextLine();
            System.out.println(puzzle.getHint(word));
        }
        System.out.println("That was the word!!!");
    }
}
