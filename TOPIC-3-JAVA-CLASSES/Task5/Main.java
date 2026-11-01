public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Simona");
        account.deposit(100.0);
        account.withdraw(30);
        account.withdraw(90.0); // This will trigger the validation message for withdrawal
        account.deposit(-10.0); // This will trigger the validation message for deposit
        System.out.println("Current balance: " + account.getBalance());
    }
}