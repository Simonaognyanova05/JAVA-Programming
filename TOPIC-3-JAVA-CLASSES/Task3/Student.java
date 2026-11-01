public class Student{
    private String name;
    private String facultyNumber;
    private double grade = 2.0;

    public void setName(String name){
        if(name.length() < 3){
            System.out.println("Name must be at least 3 characters long.");
        } else {
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public void setFacultyNumber(String facultyNumber){
        if(facultyNumber.length() != 9){
            System.out.println("Faculty number must be exactly 9 characters long.");
        } else {
            this.facultyNumber = facultyNumber;
        }
    }

    public String getFacultyNumber(){
        return facultyNumber;
    }

    public void setGrade(double grade){
        if(grade < 2.0 || grade > 6.0){
            System.out.println("Grade must be between 2.0 and 6.0.");
        } else {
            this.grade = grade;
        }
    }

    public double getGrade(){
        return grade;
    }

    public void printStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Faculty Number: " + facultyNumber);
        System.out.println("Grade: " + grade);
    }
}