package Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //for loop
        for(int i =0; i <= 100; i++){
            System.out.println(i);
        }

        //In decreasing order
        for(int i =100; i >= 1; i--){
            System.out.println(i);
        }

        //Break and Continue
        for (int i = 0; i < 5; i++){
            if (i == 4){
                continue;  //for skipping values
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++){
            if (i == 2){
                break;  //for terminating program
            }
            System.out.println(i);
        }


        int size = 5;
        int[] numbers = {1,2,3,4,5};

        for (int i = 1; i < size; i++){
            if (numbers[i] == 3){
                System.out.println("Number 3 found.");
            }
        }

        //While loop
        int i = 0;
        while (i <= 100){
            System.out.println(i);
            i = i + 1;
        }

        int j = 1;
        do {
            System.out.println(j);
            j = j + 1;
        }while (j <= 10);

        //Practice program
        Scanner sc = new Scanner(System.in);
        int numberss= 0;

        do {
            System.out.println("Enter numbers: ");
            numberss = sc.nextInt();
            System.out.println("Number you entered: ");
            System.out.println(numbers);
        }while (numberss >= 0);
        System.out.println("The End.");
    }
}
