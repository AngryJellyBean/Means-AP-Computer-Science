public class Main {

    public static void main(String[] args) {
        //Declaring myArray
        int[] myArray = {0, 3, -2, -6, 15, 36, -19};
        //Call the two methods you wrote, and print the results
        System.out.println(allNegative(myArray));
        System.out.println(numEven(myArray));
    }

    public static boolean allNegative(int[] arr) {
        // Returning false if any of the values are 0 or greater
        for (int i : arr)
            if (i >= 0)
                return false;
        return true;
    }

    public static int numEven(int[] arr) {
        int even = 0;
        // If the number is even, add one to the total of even numbers
        for (int i : arr)
            if (i % 2 == 0)
                even++;
        // return final total of even numbers
        return even;
    }
}
