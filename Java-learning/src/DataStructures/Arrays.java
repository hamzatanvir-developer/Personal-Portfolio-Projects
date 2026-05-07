package DataStructures;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();;
        int[] numbers = new int[size];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("\nAll numbers you entered.");

    }
}
