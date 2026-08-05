interface Printable {
    void print();
}

class Student implements Printable {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void print() {
        System.out.println("Student Details");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}

class Employee implements Printable {

    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void print() {
        System.out.println("Employee Details");
        System.out.println("Name : " + name);
        System.out.println("Employee ID : " + empId);
    }
}

public class PrintableDemo {

    public static void main(String[] args) {

        Printable p1 = new Student("Shreya Panda", 181);
        Printable p2 = new Employee("Novera", 126);

        p1.print();
        System.out.println();

        p2.print();
    }
}