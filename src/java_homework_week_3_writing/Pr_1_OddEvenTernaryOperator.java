package java_homework_week_3_writing;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Pr_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing scanner object
        scanner.close();

    }
    //Checking the number ie even or odd
    public static void isItOddOrEvenNumber(int number){
    //ternary operator is used
        String evenOrOdd = (number % 2==0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
