public class HiddenWord {

    private String word;

    // Constructor
    public HiddenWord(String word) { this.word = word; }

    public String getHint(String guess) {
        // String concatenation in a loop is bad practice, so we use StringBuilder
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            // If the char in the current index of the guess is equal to the char in the same index of the actual word, append the char to result
            if (guess.charAt(i) == word.charAt(i)) result.append(guess.charAt(i));

                // If the char is not contained in the word, indexOf will return a -1.
                // If it is contained, indexOf will return the index of where that char is located.
                // As long as the returned integer is not -1, we know that the character IS in the word, so we append "+" to result
            else if (word.indexOf(guess.charAt(i)) != -1) result.append("+");

                // Otherwise, we know that the character is NOT there. So we append "*"
            else result.append("*");
        }
        // Return the final result
        return result.toString();
    }
}
