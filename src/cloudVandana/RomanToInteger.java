package cloudVandana;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase
	        
	        int result = romanToInt(romanNumeral);
	        System.out.println("Integer value of Roman numeral " + romanNumeral + " is: " + result);
	        
	        scanner.close();
	    }

	    public static int romanToInt(String s) {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        // Initialize the Roman numeral to integer mapping
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        // Iterate through the Roman numeral string from right to left
	        for (int i = s.length() - 1; i >= 0; i--) {
	            int currValue = romanMap.get(s.charAt(i));

	            // If the current numeral is smaller than the previous one, subtract it
	            if (currValue < prevValue) {
	                result -= currValue;
	            } else {
	                result += currValue;
	            }

	            prevValue = currValue;
	        }

	        return result;
	    }
	
}
