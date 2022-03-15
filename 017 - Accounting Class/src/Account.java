public class Account {

    //Attributes for name, account ID, balance, and annual interest rate. Make them all private. (4 pts)
    private String name;
    private int ID;
    private double balance;
    private double rate;

    //Default Constructor
    public Account(){
        //set all instance variables to default values (2 pts)
        name = "No name";
        ID = 0;
        balance = 0.0;
        rate = 0.0;
    }

    //Parameter Constructor #1
    public Account(String aName, int aID, double aBalance, double aRate){
        //set instance variables to parameter values (2 pts)
        name = aName;
        ID = aID;
        balance = aBalance;
        rate = aRate;
    }

    //Parameter Constructor #2
    public Account(String aName, int aID){
        //set some instance variables to parameter values, and some to default values (2 pts)
        name = aName;
        ID = aID;
        balance = 0.0;
        rate = 1.0;
    }

    //Behaviors
    public void deposit(double deposit){
        //add to the balance (1 pt)
        balance += deposit;
    }

    public void withdrawal(double withdrawal){
        //subtract from the balance (1 pt)
        balance -= withdrawal;
    }

    public void addAnnualInterest(){
        //add the annual interest to the balance (1 pt)
        balance *= rate;
    }

    public String getName(){
        //return name (1 pt)
        return name;
    }

    public int getID(){
        //return id (1 pt)
        return ID;
    }

    public double getBalance(){
        //return balance (1 pt)
        return balance;
    }
    
    public void setAnnualInterestRate(double r){
        //set the interest rate to r (1 pt)
        rate = r;
    }

    public String toString(){
        //return a string that contains all information about the account (4 pts)
        return "\nAccount name: " + name 
            + "\nAccount ID: #" + ID 
            + "\nBalance: $" + balance 
            + "\nAnnual interest rate: " + rate;
    }
}