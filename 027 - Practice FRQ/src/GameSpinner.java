public class GameSpinner {

    int sectors;
    int lastNum;
    int runs = 0;

    // Constructor
    public GameSpinner(int n) { sectors = n; }

    public int spin() {
        // Generate a random number based on how many sectors are in this instance of the object
        int num = (int) (Math.random() * (sectors) + 1);

        // Check if this current number is equal to the previous number. If so, add one to the current run
        // Otherwise, reset the current run
        if (num == lastNum) runs++;
        else runs = 1;

        // Now that we are done with num, it is considered the last num. We can use this for our next call of this method.
        lastNum = num;

        // After all the work is done, return that random number
        return num;
    }

    // Method to return the current run
    public int currentRun() { return runs; }
}