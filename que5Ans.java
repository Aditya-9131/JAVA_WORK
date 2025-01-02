import java.util.Scanner;

public class que5Ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        sc.close();

        int wordCount = countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCount);

        System.out.println("Palindrome words in the sentence:");
        displayPalindromeWords(sentence);
    }

    public static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equalsIgnoreCase(reversed.toString());
    }

    public static void displayPalindromeWords(String sentence) {
        String[] words = sentence.split("\\s+");
        
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }
}
