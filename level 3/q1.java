import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;

        // Count digits
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Store digits
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        // Frequency array (0–9)
        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Output
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
