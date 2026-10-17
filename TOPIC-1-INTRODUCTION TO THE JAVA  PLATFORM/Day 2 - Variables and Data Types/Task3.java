public class Task3{
    public static void main(String[] args){
        double balance = 500.75;
        double deposit = 200.00;
        double withdrawal = 125.50;

        double newBalance = balance + deposit - withdrawal; 

        System.out.println("Final balance: " + newBalance);    
    }
}