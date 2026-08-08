// Importing classes from user-defined packages
import student.Student;
import faculty.Faculty;

public class CollegeSys {
    public static void main(String[] args) {
        // Instantiate Student class from student package
        Student student1 = new Student(181, "Shreya Panda", "Computer Science");
        
        // Instantiate Faculty class from faculty package
        Faculty faculty1 = new Faculty(501, "Dr. Sudanshu Gonge", "Programming with Java");

        // Display information
        student1.displayStudentInfo();
        System.out.println(); // Spacing
        faculty1.displayFacultyInfo();
    }
}