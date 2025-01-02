import java.util.Scanner;
public class que1ans {
   // import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        double sum = 0.0;
        for (int num : arr) {
            sum += num;
        }

        double average = sum / n;

        System.out.println("Average of the elements: " + average);
    }
}

