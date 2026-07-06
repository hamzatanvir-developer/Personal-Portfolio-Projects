package Basics;

import java.util.Scanner;

// Array is basically a data structure which we use to store multiple same elements "e.g" marks,subjects,students etc.

public class Arrays {
    public static void main(String[] args) {
        //Array creation nd initialization
        //Input
        Scanner input = new Scanner(System.in);

        //Input of size
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] marks = new int[size];

        //Input of numbers in array
        System.out.print("Enter marks: ");
        for (int i = 0; i< size; i++){
            marks[i] = input.nextInt();
        }

        //Output
        System.out.println("You Entered: ");
        for (int i = 0; i < size; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        System.out.println("End of lesson.");
    }
}

