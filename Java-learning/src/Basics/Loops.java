package Basics;

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
    }
}
