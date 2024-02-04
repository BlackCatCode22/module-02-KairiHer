import java.util.Scanner;

import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the input string
        String reversedString = reverseString(inputString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string
    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move towards the center of the string
            start++;
            end--;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }
}
