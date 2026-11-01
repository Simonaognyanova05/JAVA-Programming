public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setFacultyNumber("123456789");
        student.setGrade(5.0);
        student.setGrade(7.5); // This will trigger the validation message for grade

        student.printStudentInfo();

    }
}
