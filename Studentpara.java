class Studentpara {
    int id;
    String name;

    // Parameterized Constructor
    Studentpara(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Studentpara s1 = new Studentpara(181, "Shreya");
        Studentpara s2 = new Studentpara(32, "Shrestha");

        s1.display();
        s2.display();
    }
}