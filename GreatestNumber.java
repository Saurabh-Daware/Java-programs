package conditionalStatement;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Enter third number");
		c = sc.nextInt();
		
		System.out.println("Greatest number is " + Comparison(a,b,c));
	}

	private static int Comparison(int a, int b, int c) {
		return b > a ? b > c ? b : c : a > c ? a : c;	
	}

}
