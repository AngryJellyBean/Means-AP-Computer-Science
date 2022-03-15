public class Main {

    public static void main(String[] args) {
        //Create three new Account objects, using the three different constructors respectively. (3 pts)
        Account acc = new Account();
        Account joe = new Account("Joe", 123, 100.0, 1.2);
        Account bob = new Account("Bob", 300);

        //Print the account information to the screen for all three accounts. (3 pts)
        System.out.println(acc);
        System.out.println(joe);
        System.out.println(bob);

        //Deposit money into an account. Withdrawal money from another account. Add annual interest to the third accound. (3 pts)
        acc.deposit(20.0);
        joe.withdrawal(13.0);
        bob.addAnnualInterest();

        //Print the account information to the screen for all three accounts. (3 pts)
        System.out.println(acc);
        System.out.println(joe);
        System.out.println(bob);

        //Print the sum of all three account balances. (3 pts)
        double sum = acc.getBalance() + joe.getBalance() + bob.getBalance();
        System.out.println("\nSum of all three account balances: " + sum);
        
    }

}
