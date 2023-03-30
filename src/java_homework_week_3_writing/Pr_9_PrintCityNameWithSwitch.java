package java_homework_week_3_writing;
import java.util.Scanner;
/**
 *9.Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
public class Pr_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any alphabet between A to F : ");
        String city = scanner.next().toUpperCase();
        //Create object and call the instance method
        Pr_9_PrintCityNameWithSwitch cityName = new Pr_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        //closing the scanner object
        scanner.close();
    }
    //Printing city name
      public void printCityName(String city){
      switch (city){
          case "A":
              System.out.println("Aberdeen");
              break;
          case "B":
              System.out.println("Belfast");
              break;
          case "C":
              System.out.println("Cambridge");
              break;
          case "D":
              System.out.println("Derby");
              break;
          case "E":
              System.out.println("Edinburgh");
              break;
          case "F":
              System.out.println("Feltham");
              break;
          default:
              System.out.println("The alphabet you enter is not between A to F");
      }
      }
}