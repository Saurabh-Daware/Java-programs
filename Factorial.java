import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int factorial = 1;
		sc.close();
		for (int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of given number is: " + factorial);
	}
}
