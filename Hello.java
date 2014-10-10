import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Hello, Github User");
    System.out.println("What is your name?");
    String name = scn.next();
    System.out.println("Hello, " +name);
    System.out.println("When was your birth year?");
    double year = scn.nextDouble();
    if (year >=1995) {
    System.out.println("You are not old enough for this program, goodbye.");
                     }
    else {
    System.out.println("Welcome to the program, how can I help you?");
    String answer1 = scn.next();
    System.out.println("Error 404, program does not support " +answer1);
         }
   
  }
}
