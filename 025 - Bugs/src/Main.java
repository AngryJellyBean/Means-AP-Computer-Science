public class Main {

    public static void main(String[] args) {
        //Creating a few bugs
        Bug bugA = new Bug("Ronnie", "spider", 8, false);
        Bug bugB = new Bug();
        Bug bugC = new Bug("Samantha", "caterpillar", 6, false);
        Bug bugD = bugC;

        //Using the toStrings to list each bug's info
        System.out.println(bugA);
        System.out.println(bugB);
        System.out.println(bugC);
        System.out.println(bugD);
        System.out.println();

        //Uh oh...
        bugA.setNumLegs(7);
        System.out.println("Some mean kid pulled one of " + bugA.getName() + "'s legs off!");
        System.out.println("Now he has " + bugA.getNumLegs() + " legs!");
        System.out.println();

        //Cycle of life
        System.out.println("Haven't seen " + bugC.getName() + " in a while...");
        bugC.setType("butterfly");
        bugC.setHasWings(true);
        System.out.println("Oh wow! They turned into a " + bugC.getType() + "!");
        System.out.println();

        //Notice that bugD also had its attributes change, because it references the same object.
        System.out.println("Copy Cat!");
        System.out.println(bugD);
        System.out.println(bugC);

    }

}
