import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for x: ");
        int x = scanner.nextInt();
        System.out.println("Enter value for y: ");
        int y = scanner.nextInt();
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
