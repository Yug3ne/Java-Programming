import java.util.Scanner;

public class decisonOperators {
    public static void main(String[] args) {
        System.out.println("Enter the temparature in your area: ");
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();

        if (temp <= 20) {
            System.out.println("It is cold outside");
        }
        else if (temp > 20 && temp <=30 ) {
            System.err.println("The temperature is average");
        }
        else{
            System.out.println("It is hot outside");
        }
    }

}
