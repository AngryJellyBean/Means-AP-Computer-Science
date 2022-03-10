public class Main {
    public static void main(String[] args) {
        String[] cheese = {"Tomato", "Potato", "David", "Means", "Computer", "Science", "Christmas", "Dinner"};


        /*
         * THESE TESTS ARE NOT REQUIRED BY THE PROMPT.
         */

        // Test 1. Should return 'true'
        System.out.println("TEST 1");
        if (insert(cheese, "CHICKEN!", 2))
            System.out.println("It worked! We successfully performed surgery on an array!");
        else
            System.out.println("Oh man, what the hell is this abomination?");

        // Test 2. Should return 'false'
        System.out.println("\nTEST 2");
        if (insert(cheese, "CHICKEN!", 100))
            System.out.println("It worked! We successfully performed surgery on an array!");
        else
            System.out.println("Oh man, what the hell is this abomination?");
    }


    // The meat and potatoes of the program
    public static boolean insert(String[] words, String newWord, int place) {
        // if place doesn't represent a valid index for words
        if (place > words.length - 1 || place < 0)
            return false;

        // Replace words at the end of the array, one by one until we get to the desired index
        // Desired index will be replaced by 'newWord'
        for (int i = words.length-1; i > place; i--) {
            words[i] = words[i-1];
            words[i-1] = newWord;
        }
        return true;
    }

}