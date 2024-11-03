import java.util.Scanner;

public class ExceptionHandling5 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 20, 3, 7, 15};
        int divission = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index:");
        int index = scanner.nextInt();
        try {
            System.out.println("Array element at index " + index + "  =  " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
            try {
                System.out.println(index/divission);
            } catch (ArithmeticException e1) {
                System.out.println("Cannot divide by zero.");
            }
            finally {
                scanner.close();
            }

    }
}





