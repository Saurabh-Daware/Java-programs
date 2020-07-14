package conditionalStatement;
import java.util.Scanner;

public class LegalAgeVerifier {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		checkAge(age);
		
		
	}

	private static void checkAge(int age) {
		
		if (age >= 18) {
			System.out.println("You can vote!");
		}
		else {
			System.out.println("You cannot vote");
		}
		
		
	}

}