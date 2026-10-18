import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        switch (grade) {
            case 2:
                System.out.println("Fail");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Very Good");
                break;
            case 6:
                System.out.println("Excellent");    
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        scanner.close();    
    }   
}