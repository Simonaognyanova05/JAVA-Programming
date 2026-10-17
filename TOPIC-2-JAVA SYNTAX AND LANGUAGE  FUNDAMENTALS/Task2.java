import java.util.Scanner;   

public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if(b == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }


        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.printf("Quotient: %.2f\n", (double) a / b);
        System.out.println("Remainder: " + (a % b));

        scanner.close();
    }
}