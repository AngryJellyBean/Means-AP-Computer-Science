import java.util.Random;

public class RandomNumber {
    public static int createNumber() {

        //constructing random class
        Random rand = new Random();
        //assigning a random number to num
        int num = 1 + rand.nextInt(11);
        //returning the random number
        return num;
    }
}