public class Bank_Driver {
    public static void main(String[] args) {
        Bank_Account Alice_Account = new Bank_Account(100, "Alice");

        Alice_Account.print_this();
        Alice_Account.deposit(500);

    }
}
