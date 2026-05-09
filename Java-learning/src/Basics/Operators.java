package Basics;

public class Operators {
    public static void main(String[] args) {

        //Arithmetic operators
        int a = 100;
        int b = 20;

        double sum = a + b;
        double diff = a - b;
        double product = a * b;
        double div = a / b;
        double mod = a % b;

        System.out.println("Sum is :" + sum);
        System.out.println("Difference is :" + diff);
        System.out.println("Product :" + product);
        System.out.println("Quotient :" + div);
        System.out.println("Remainder :" + mod);

        //Assignment operators
        // =  these are assignment operators ++ -- these are unary operators operate with single variable
        int num1 = 1;
        int num2 = 3;
        ++num2;
        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num2--;
        System.out.println(num2);

        //Comparison Operators
        // == != >= <= > <  these are comparison operators
        int no1 = 20;
        int no2 = 30;

        if (num1 == num2){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal.");

        }

        if (no1 < no2){
            System.out.println("First number is lesser.");
        }

        //Conditional Statements
        //if-else are conditional statements

        String name = "Hamza";

        if (name.equals("Hamza")){
            System.out.println("Good boy.");
        }else {
            System.out.println("Bad boy.");
        }

        boolean sunUp = true;
        if (sunUp == true){
            System.out.println("Day");
        }else {
            System.out.println("Night");
        }

        //Logical operators
        // &&(check both conditions) ||(atleast one true) !(change true to false and false to true)
        int cash = 100;
        int numb1 = 10;
        int numb2 = 20;

        if (cash < 10){
            System.out.println("Cannot buy anything.");
        } else if (cash > 100) {
            System.out.println("Buy anything.");
        } else if (cash < 10 || cash <= 100) {
            System.out.println("Chances.");
        }

        if (numb1 > 5 && numb2 < 100){
            System.out.println("Okay.");
        }

        int day = 3;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wednesday - Sunday");
        }

        //Maths class

        System.out.println(Math.max(3,5)); //.max for maximum
        System.out.println(Math.min(3,5)); //.min for minimum
        System.out.println((int)(Math.random()*100)); //.random for random numbers
    }
}
