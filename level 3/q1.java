import java.util.Random;

public class q1 {

    // Method to find sum
    public static int sum(int[] arr) {
        int total = 0;
        for (int x : arr) total += x;
        return total;
    }

    // Method to find mean
    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    // Method to find shortest
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
        }
        return min;
    }

    // Method to find tallest
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights (150–250 cm)
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        // Display heights
        System.out.print("Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nMean Height: " + mean(heights));
        System.out.println("Shortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
    }
}
