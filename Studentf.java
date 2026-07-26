class Studentf {
    int id;
    String name;

    // Default Constructor
    Studentf() {
        id = 181;
        name = "Shreya";
    }

    // Parameterized Constructor
    Studentf(int i, String n) {
        id = i;
        name = n;
    }

    // Copy Constructor
    Studentf(Studentf s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        // Default Constructor
        Studentf s1 = new Studentf();

        // Parameterized Constructor
        Studentf s2 = new Studentf(181, "Shreya");

        // Copy Constructor
        Studentf s3 = new Studentf(s2);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor:");
        s2.display();

        System.out.println();

        System.out.println("Copy Constructor:");
        s3.display();
    }
}