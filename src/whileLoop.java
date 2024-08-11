import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = input.nextLine();
        }
        System.out.println("Hello "+name);
    }
}
