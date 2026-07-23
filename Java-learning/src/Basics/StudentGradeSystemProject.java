package Basics;

import java.util.Scanner;

public class StudentGradeSystemProject {

    //Declaration and initialization
    static String[] names = new String[50];
    static int[] rollNumbers = new int[50];
    static int[][] marks = new int[50][3];
    static int studentCount = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent();
                    break;
                case 2: deleteStudent();
                    break;
                case 3:displayAll();
                    break;
            }

        } while (choice != 8);
    }

    public static void printMenu() {
        System.out.println("========== Student Management System ========");
        System.out.println("1.Add Student");
        System.out.println("2.Delete Student");
        System.out.println("3.Display all");
       /* System.out.println("4.Search student");
        System.out.println("5.Update marks");
        System.out.println("6.Find topper");
        System.out.println("7.Class average");
        System.out.println("8.Exit");*/

        System.out.println("Enter choice: ");


    }

    static void addStudent() {
        if (studentCount >= 50) {
            System.out.println("Student list is full.");
        }

        System.out.println("Enter name: ");
        sc.next();
        System.out.println("Enter roll number: ");
        int rollNumber = sc.nextInt();

        if (rollNumber == -1) {
            System.out.println("Roll number already exist.");
            return;
        }

        int[] studentMarks = new int[3];
        for (int i = 0; i < 3; i++) {
            int m;
            do {
                System.out.println("Enter marks: " + (i + 1) + "(0 - 100): ");
                m = sc.nextInt();
                if (m < 0 || m > 100) {
                    System.out.println("Invalid marks. Try again.");
                }
            } while ((m < 0 || m > 100));

            studentMarks[i] = m;
            studentCount++;

            System.out.println("Student added.");
        }
    }

    static void deleteStudent(){
        if (studentCount == 0){
            System.out.println("Student list is empty.");
        }

        int rollNumber;
        System.out.println("Enter roll number to delete: ");
        rollNumber = sc.nextInt();

        if (rollNumber == -1){
            System.out.println("Student not found.");
        }

        studentCount--;
    }

    static void displayAll(){
        if (studentCount == 0){
            System.out.println("Students list is empty.");
        }

        for (int i = 0 ; i <= studentCount; i++){
            System.out.println("Name | "+ names + "Roll Number | "+ rollNumbers + "Marks | "+ marks);
        }
    }

    static String searchStudent(){
        if (studentCount == 0){
            System.out.println("Student list is empty.");
        }

        System.out.println("Enter Roll Number to find: ");
        int roll = sc.nextInt();
        int target = 0;

        if (roll == -1){
            System.out.println("Student not found.");
        }

        else {
            if (roll == target ){
                return "Name: " + names + " | Roll Number: " + rollNumbers + " | Marks: " + marks;
            }
        }
        return null;
    }
}