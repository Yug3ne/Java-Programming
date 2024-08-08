import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {

        // if statements
    Scanner input = new Scanner(System.in);
      
    System.out.println("Enter a number: ");
      int number = input.nextInt();

      if (number >0) {
        System.out.println("Number is positive");
      }else{
        System.out.println("Number is negative");
      }
    
    
    }

}
