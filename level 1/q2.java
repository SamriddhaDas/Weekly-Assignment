import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double number3 = sc.nextDouble();

        // Check if first is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Single print statement
        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}
