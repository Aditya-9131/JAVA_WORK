import java.util.Scanner;
import java.util.Arrays;

public class que4Ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        sc.close();

        displayTopKNumbers(numbers, k);
    }

    public static void displayTopKNumbers(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }

        Arrays.sort(arr);
        System.out.print("Output: ");

        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i]);
            if (i != arr.length - k) {
                System.out.print(", ");
            }
        }
    }
}
