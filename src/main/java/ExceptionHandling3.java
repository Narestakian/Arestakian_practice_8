
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer: ");
            int x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }finally {
            scanner.close();
        }
    }
}
