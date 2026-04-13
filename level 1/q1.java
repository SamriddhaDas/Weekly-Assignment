import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Single print statement
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        sc.close();
    }
}
