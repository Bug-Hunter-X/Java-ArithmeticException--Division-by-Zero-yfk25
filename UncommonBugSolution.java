import java.util.InputMismatchException;
import java.util.Scanner;

public class UncommonBugSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z = 0; 
        boolean validInput = false;

        while(!validInput){
            try{
                System.out.print("Enter the value of x: ");
                x = scanner.nextInt();
                System.out.print("Enter the value of y: ");
                y = scanner.nextInt();
                if(y == 0){
                    System.out.println("Error: Division by zero is not allowed. Please enter a non-zero value for y.");
                } else {
                    z = x / y;
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.next(); // Consume invalid input
            }
        }
        System.out.println("The result of x / y is: " + z);
        scanner.close();
    }
}