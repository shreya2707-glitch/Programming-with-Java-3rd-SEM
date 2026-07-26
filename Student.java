class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        id = 181;   
        name = "Shreya Panda";
    }

    void display() {
        System.out.println("Default Constructor");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}