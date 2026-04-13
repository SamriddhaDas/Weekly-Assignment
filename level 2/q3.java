import java.util.Scanner;

public class q3 {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year should be >= 1582");
        } else if (isLeapYear(year)) {
            System.out.println("The year is a Leap Year");
        } else {
            System.out.println("The year is not a Leap Year");
        }

        sc.close();
    }
}
