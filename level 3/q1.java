import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year should be >= 1582");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year is a Leap Year");
                    } else {
                        System.out.println("The year is not a Leap Year");
                    }
                } else {
                    System.out.println("The year is a Leap Year");
                }
            } else {
                System.out.println("The year is not a Leap Year");
            }
        }

        sc.close();
    }
}
