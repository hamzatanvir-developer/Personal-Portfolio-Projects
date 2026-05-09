package Basics;

public class ExceptionHandling {
    public static void main(String[] args) {

        //Exception are not errors these can be handled by try - catch statements
        //We write Exceptions in try block and rest of statements execute normally after catch block

        int [] marks = {90,95,99};

        try {
            System.out.println(marks[5]);
        }catch (Exception exception){
            //do something after catching
            System.out.println("Normal flow after catching.");
        }
        System.out.println("Hamza");

    }
}
