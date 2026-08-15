package student;

public class Student {
    private int studentId;
    private String name;
    private String course;

    // Constructor
    public Student(int studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    // Public method to display student details
    public void displayStudentInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
    }
}