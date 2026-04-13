import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Conversion formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Single print statement
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        sc.close();
    }
}
