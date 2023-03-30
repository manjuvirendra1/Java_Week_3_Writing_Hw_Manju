package java_homework_week_3_writing;
import java.util.Scanner;
/**
 *12.Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Pr_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        //Object creation
        Pr_12_FindInputValue inputValue = new Pr_12_FindInputValue();
          inputValue.checkInputValurIsAlphabetNumberOrSymbol(ch);
          //Closing the scanner object
    }
    //Find the input value is Alphabet, Digit and Symbol
    public void checkInputValurIsAlphabetNumberOrSymbol(char ch){
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        }else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        }else {
            System.out.println(ch + " is a Symbol.");
        }
    }
}
