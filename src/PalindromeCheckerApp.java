import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // convert to lowercase for case-insensitive check
        String original = word.toLowerCase();
        String reversed = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if(original.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        scanner.close();
    }
}