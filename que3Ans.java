import java.util.Scanner;

public class que3Ans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        scanner.close();

        // Using if-else statement
        int largestUsingIfElse = num1;

        if (num2 > largestUsingIfElse) {
            largestUsingIfElse = num2;
        }
        if (num3 > largestUsingIfElse) {
            largestUsingIfElse = num3;
        }

        System.out.println("Largest using if-else: " + largestUsingIfElse);

        // Using ternary operator
        int largestUsingTernary = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("Largest using ternary operator: " + largestUsingTernary);
    }
}
