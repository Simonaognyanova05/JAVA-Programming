public class BankAccount{
    private String owner;
    private double balance;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance = 0.0;
    }

    public double deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        return balance;
    }

    public double withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive and less than or equal to the current balance.");
        }
        return balance;
    }

    public double getBalance(){
        return balance;
    }
}