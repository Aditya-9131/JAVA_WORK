package labassignment.javaassignment;
import java.util.Scanner;
public class ass2q1aA {
   // import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        double sum = 0.0;
        for (int num : arr) {
            sum += num;
        }

        double average = sum / n;

        System.out.println("Average of the elements: " + average);
    }
}

