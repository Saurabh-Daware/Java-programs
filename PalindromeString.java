package practice;
import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String text = sc.nextLine();
		if(isPalindrome(text)) System.out.println("Given string is palindrome");
		else System.out.println("Given string is not palindrome");
		sc.close();
	}
	
	static boolean isPalindrome(String text) {

		int i = 0, j = text.length() -1;
		while(i < j) {
			if(text.charAt(i) != text.charAt(j)) return false;
			i++; j--;
		}
		return true;				
	}
}
