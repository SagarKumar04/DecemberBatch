package SelectionStatements;

//1. Importing the Scanner class
import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        //2. Creating an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        //3. Use appropriate functions of Scanner class
        int num = scanner.nextInt();

        if(num >= 0) {
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Negative Number");
        }
    }
}
