package java_homework_week_3_writing;
import java.util.Scanner;
/**
 *16.Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
  “ZERO”
 */

public class Pr_16_FindPositiveNegativeNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //closing the scanner object
        scanner.close();
    }

   //Finding the number is Positive, Negative or Zero
   public static void findNumberIsPositiveNegativeOrZero(int number){
    if (number > 0) {
        System.out.println(number + " is a Positive number");
    } else if (number < 0) {
        System.out.println(number + "is a Negative number");
    } else {
        System.out.println(number + " is Zero");
    }
    }
   }