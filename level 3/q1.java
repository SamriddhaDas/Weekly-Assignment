import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Conversion formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Single print statement
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        sc.close();
    }
}
