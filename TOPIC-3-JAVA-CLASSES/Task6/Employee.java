public class Employee{
    private String name;
    private double salary;
    private static int employeeCount = 0;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void printInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}