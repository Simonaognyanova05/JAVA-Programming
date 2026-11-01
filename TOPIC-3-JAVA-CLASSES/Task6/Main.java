public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Count: " + Employee.getEmployeeCount());

        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        Employee emp3 = new Employee("Charlie", 70000);

        emp1.printInfo();
        emp2.printInfo();
        emp3.printInfo();

        System.out.println("Employee Count: " + Employee.getEmployeeCount());
    }
}