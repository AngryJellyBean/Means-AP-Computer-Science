public class Bug {

    //Attributes of a bug
    private String name;
    private String type;
    private int numLegs;
    private boolean hasWings;

    //Default Constructor
    public Bug() {
        name = "Unknown";
        type = "Unknown";
        numLegs = 6;
        hasWings = false;
    }

    //Parameter Constructor
    public Bug(String n, String t, int l, boolean w) {
        name = n;
        type = t;
        numLegs = l;
        hasWings = w;
    }

    //Write an accessor method for each attribute of the Bug class
    //The accessor for name has been written for you
    public String getName(){
        return name;
    }

    //Accessor for type
    public String getType() {
        return type;
    }

    //Accessor for numLegs
    public int getNumLegs() {
        return numLegs;
    }

    //Accessor for hasWings
    public boolean getHasWings() {
        return hasWings;
    }
    //Write a mutator method for each attribute of the Bug class
    //The mutator for name has been written for you
    public void setName(String newName){
        name = newName;
    }

    //Mutator for type
    public void setType(String newType) {
        type = newType;
    }

    //Mutator for numLegs
    public void setNumLegs(int num) {
        numLegs = num;
    }

    //Mutator for hasWings
    public void setHasWings(boolean wings) {
        hasWings = wings;
    }

    //Write a toString method for the Bug class. It has been started for you.
    public String toString(){
        return /* Put all info about the bug here, as a single string. */
        "Name: " + name + 
        "\nType: " + type + 
        "\nNumber of Legs: " + numLegs +
        "\nHas Wings? " + hasWings + "\n";
    }

}