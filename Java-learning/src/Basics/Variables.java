package Basics;

public class Variables {
    public static void main(String[] args) {

       /*Variables                 Bytes
        int                         4
        char                        2
        string                    varies
        float                       4
        double                      8
        long                        8
        short                       2
        boolean                     1*/

        // Integer types
        byte age = 19;           // 1 byte
        short year = 2024;       // 2 bytes
        int salary = 50000;      // 4 bytes
        long population = 8000000000L;  // 8 bytes

        // Decimal types
        float height = 5.9f;     // 4 bytes
        double gpa = 3.5;       // 8 bytes

        // Other types
        boolean isStudent = true;  // 1 byte
        char grade = 'A';          // 2 bytes (Java uses UTF-16)
        String name = "Muhammad Hamza";     // varies

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Student: " + isStudent);
        System.out.println("Salary: " + salary);
    }
}
