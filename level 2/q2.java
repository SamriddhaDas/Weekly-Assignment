import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter base (in cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert to square inches (1 inch = 2.54 cm → 1 sq in = 2.54 * 2.54 sq cm)
        double areaIn = areaCm / (2.54 * 2.54);

        // Single print statement
        System.out.println("The Area of the triangle in sq in is " 
                + String.format("%.2f", areaIn) 
                + " and sq cm is " 
                + String.format("%.2f", areaCm));

        sc.close();
    }
}
