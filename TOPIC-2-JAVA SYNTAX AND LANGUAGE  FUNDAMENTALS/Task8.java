
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        double initialBalance = 1000.0;

        System.out.println("===== BANK ACCOUNT =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("Choose an option:");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        while (option != 4) {
            switch (option) {
                case 1:
                    System.out.printf("Current Balance: %.2f%n", initialBalance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Deposit amount must be greater than zero.");
                    } else {
                        initialBalance += depositAmount;
                        System.out.printf("Deposited: %.2f%n", depositAmount);
                    }

                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= 0) {
                        System.out.println("Withdrawal amount must be greater than zero.");
                    } else if (withdrawAmount <= initialBalance) {
                        initialBalance -= withdrawAmount;
                        System.out.printf("Withdrew: %.2f%n", withdrawAmount);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println("\n===== BANK ACCOUNT =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Choose an option:");
            option = scanner.nextInt();

        }
        scanner.close();
    }
}
