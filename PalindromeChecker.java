import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Checker ===");
        System.out.println("1. Check String");
        System.out.println("2. Check Number");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter a string: ");
            String str = sc.next();

            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed = reversed + str.charAt(i);
            }

            if (str.equalsIgnoreCase(reversed)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }

        } else if (choice == 2) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int original = number;
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
