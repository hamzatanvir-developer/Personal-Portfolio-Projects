package Basics;

public class Functions {

    //Functions are defined to do specific and repetitive tasks
    //Define to perform specific and repetitive tasks so that we don't need to write same code again and again

    public static void printJava(){
        System.out.println("Hello Java");
    }

    //Function for adding numbers
    public static int add(int a , int b){
        return a + b;
    }

    //Function for subtracting numbers
    public static int subtract(int a , int b){
        return a - b;
    }

    //Function for multiplying numbers
    public static int mul(int a , int b){
        return a * b;
    }


    public static void main(String[] args) {
        printJava();
        System.out.println(add(3,5)); //8
        System.out.println(mul(3,5)); //15
        System.out.println(subtract(3,5)); //-2
    }

}
