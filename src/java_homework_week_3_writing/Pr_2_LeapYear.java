package java_homework_week_3_writing;

import java.util.Scanner;

/**
 * 2.Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Pr_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();
        Pr_2_LeapYear leapYear = new Pr_2_LeapYear();
        leapYear.isItLeapYear(year);
        //closing the scanner object
        scanner.close();
    }

    //Checking is it leap year or not
    public void isItLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");
    }
}
