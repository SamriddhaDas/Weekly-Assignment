import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the perimeter: ");
        double perimeter = sc.nextDouble();

        // Calculating side
        double side = perimeter / 4;

        // Single print statement
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}
