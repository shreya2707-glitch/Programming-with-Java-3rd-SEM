class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
        System.out.println("Salary        : " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);   // Calls parent class constructor
        this.department = department;
    }

    void displayManager() {
        super.display();           // Calls parent class method
        System.out.println("Department    : " + department);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {

        Manager m = new Manager("Shreya Panda", 181, 75000, "CSE");

        m.displayManager();
    }
}