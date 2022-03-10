public class Main {

    public static void main(String[] args) {
        // Initializing array
        String[] words = {"every", "nearing", "checking", "food", "stand", "value"};

        // Calling variable
        reverse(words);
    }

    public static void reverse(String[] words) {
        // for each individual String 'word' in the given array
        for (String word : words) {

            // print each character in the string, backwards
            for (int i = word.length()-1; i >= 0; i--)
                System.out.print(word.charAt(i));

            // start a new line for the next word
            System.out.println();
        }
    }
}