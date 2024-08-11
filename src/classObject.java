
class Calculator { //class
    public int add(int n1, int n2) {  //method
        int r = n1+n2;
        return r;
    }
}

public class classObject {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 4;
        num2 = 5;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);

        // int result = num1 + num2;
        System.out.println(result);
    }
}
/**  In java we create class and when we ean to use them we create the objects 
 *An example of an class/objet is the use of scanner to receive user input after importing the scanner class
 Scanner scanner = new Scanner(System.in)
 String name = nextLine()

 *
*/
