package cloudVandana;

import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase
        
        boolean isPangram = checkPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean checkPangram(String s) {
        // Create an array to mark the presence of each alphabet
        boolean[] alphabetPresence = new boolean[26];
        
        // Iterate through the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Convert character to index (0-25)
                alphabetPresence[index] = true; // Mark the alphabet as present
            }
        }
        
        // Check if all alphabets (a to z) are present
        for (boolean present : alphabetPresence) {
            if (!present) {
                return false; // If any alphabet is missing, it's not a pangram
            }
        }
        
        return true; // All alphabets are present, it's a pangram
    }
}
