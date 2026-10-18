import java.util.Scanner;

public class Task7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Name to upper case: " + name.toUpperCase());
        System.out.println("Name to lower case: " + name.toLowerCase());
        System.out.println("Name length: " + name.length());
        System.out.println("if name contains a: " + name.contains("a"));
        System.out.println("First char: " + name.charAt(0));


        scanner.close();
    }
}