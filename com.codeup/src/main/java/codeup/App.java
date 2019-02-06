package codeup;

import java.util.Scanner;
import static org.apache.commons.lang3.StringUtils.*;
/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){

      Scanner scan = new Scanner(System.in).useDelimiter("\n");
      System.out.println("Enter anything:");
      String userin = scan.next();

      System.out.format("You entered:\n%s\n", userin);

      if(isAlphanumeric(userin)){
        System.out.println("The user input is a number.");
      }else {
        System.out.println("The user input is not a number.");
      }

      if(isAllLowerCase(userin)){
        userin = userin.toUpperCase();
        System.out.format("Your input, uppercase:\n%s\n", userin);
      }
      else if(isAllUpperCase(userin)){
        userin = userin.toLowerCase();
        System.out.format("Your input, lowercase:\n%s\n", userin);
      }
      else{
        System.out.println("Thinking...");
      }

    }
}
