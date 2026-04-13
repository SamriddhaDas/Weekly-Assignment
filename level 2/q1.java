import java.util.Scanner;

public class q1 {

    // Method to get factors
    public static int[] getFactors(int num) {
        int count = 0;

        // Count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int product(int[] arr) {
        int product = 1;
        for (int x : arr) product *= x;
        return product;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));

        sc.close();
    }
}
