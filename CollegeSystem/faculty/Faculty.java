package faculty;

public class Faculty {
    private int facultyId;
    private String name;
    private String department;

    // Constructor
    public Faculty(int facultyId, String name, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
    }

    // Public method to display faculty details
    public void displayFacultyInfo() {
        System.out.println("=== Faculty Information ===");
        System.out.println("Faculty ID : " + facultyId);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }
}