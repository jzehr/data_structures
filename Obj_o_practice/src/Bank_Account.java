public class Bank_Account {

    // Attributes
    private double balance;
    private String name;

    // Constructors
    public Bank_Account(String name){
        this.name = name;
        this.balance = 50;
    }

    public Bank_Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }

    // Behaviors
    public void deposit(double amount){
        this.balance += amount;

    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void print_this(){
        System.out.println(this.name+"'s balance:\t" + this.balance);
    }
}
