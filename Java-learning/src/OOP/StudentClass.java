package OOP;

public class StudentClass {
    private String name;
    private int id;

    public StudentClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        StudentClass student = new StudentClass("Hamza", 123);
        student.display();
    }
}