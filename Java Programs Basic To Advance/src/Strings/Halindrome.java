import java.util.Scanner;

public class Halindrome {

	// Function to check if a string is a palindrome
	private static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	// Function to check if a string is a halindrome
	private static boolean isHalindrome(String str) {
		int n = str.length();
		return isPalindrome(str) || isPalindrome(str.substring(0, n / 2)) || isPalindrome(str.substring(n / 2 + 1));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of strings
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		// Array to store the strings
		String[] strings = new String[n];

		// Read the strings
		for (int i = 0; i < n; i++) {
			strings[i] = scanner.nextLine();
		}

		// Count the number of halindromes
		int halindromesCount = 0;
		for (String str : strings) {
			if (isHalindrome(str)) {
				halindromesCount++;
			}
		}

		// Print the result for each test case
		System.out.println(halindromesCount);

		scanner.close();
	}
}
