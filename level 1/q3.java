import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double number3 = sc.nextDouble();

        // Checking largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Single print statement with multiline output
        System.out.println("Is the first number the largest? " + isFirstLargest +
                           "\nIs the second number the largest? " + isSecondLargest +
                           "\nIs the third number the largest? " + isThirdLargest);

        sc.close();
    }
}
