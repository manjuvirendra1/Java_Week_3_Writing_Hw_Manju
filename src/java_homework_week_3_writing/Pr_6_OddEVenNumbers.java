package java_homework_week_3_writing;
import java.util.Scanner;
/**
 *6.Write a java program to input any number and find out if it’s odd or even
 */

public class Pr_6_OddEVenNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        int number = scanner.nextInt();
        Pr_6_OddEVenNumbers oddEven = new Pr_6_OddEVenNumbers();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) +  " number");
        //Closing the scanner object
        scanner.close();
    }
    //Checking the odd or even
    public String isItEvenOrOddNumber(int number){
        if (number % 2 ==0) {
            return "Even";
        }else {
            return "Odd";
        }
    }
}
