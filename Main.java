import java.util.Scanner;
/**
 *This program will find the maximum integer between three numbers that the user inputs
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner (System.in);

    //Ask user for three integers on seperate lines
    System.out.println("Please enter three integers on seperate lines");

    //Store user input as a variable
    int a = input.nextInt();

    //Store users second integer as a variable
    int b = input.nextInt();

    //Store users thrid integer as a variable
    int c = input.nextInt();
    
    //Comparing the variables to find the maximum 
    if(a > b && a > c){
      System.out.println("Maximum: " + a);
    }
    if(b > a && b > c){
      System.out.println("Maximum: " + b);
    }
    if(c > a && c > b){
      System.out.println("Maximum: " + c);
    }
  }
}
