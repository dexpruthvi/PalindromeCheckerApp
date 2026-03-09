import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // remove spaces and convert to lowercase
        String cleaned = sentence.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for(int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        if(cleaned.equals(reversed)) {
            System.out.println(sentence + " is a Palindrome");
        } else {
            System.out.println(sentence + " is NOT a Palindrome");
        }

        scanner.close();
    }
}
