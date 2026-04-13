import java.util.Scanner;

public class q2 {

    // Count digits
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Store digits
    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        int index = 0;

        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Duck number check
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Armstrong number check
    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == num;
    }

    // Largest & second largest
    public static void largestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }

    // Smallest & second smallest
    public static void smallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(number, digits));

        largestTwo(digits);
        smallestTwo(digits);

        sc.close();
    }
}
