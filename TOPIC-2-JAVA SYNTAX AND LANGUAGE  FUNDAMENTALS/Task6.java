import java.util.Scanner;

public class Task6{
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Task6 tast6 = new Task6();

        System.out.println("Sum: " + tast6.add(num1, num2));
        System.out.println("Product: " + tast6.multiply(num1, num2));       
        System.out.println("Is first number even? " + tast6.isEven(num1));
    }   
}