import java.util.Scanner;

public class switchCase {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String day = input.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("It is the first day of the week");
                break;
            case "Monday":
                System.out.println("It is the second day of the week");
                break;
            case "Tuesday":
                System.out.println("It is the third day of the week");
                break;
            case "Wednesday":
                System.out.println("It is the forth day of the week");
                break;
            case "Thursday":
                System.out.println("It is the fifth day of the week");
                break;
            case "Friday":
                System.out.println("It is the sixst day of the week");
                break;
            case "Saturday":
                System.out.println("It is the seventh day of the week");
                break;
            default:
                System.out.println("This is not a day in the week");
                break;
        }
    }
}
