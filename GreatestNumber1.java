import java.util.Scanner;

public class GreatestNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int result = 0;
		sc.close();

		if (a > b) {
			if (a > c) {
				result = a;
			}
			if (b > c) {
				result = b;
			} else {
				result = c;
			}

		}
		System.out.println("Greatest number is " + result);

	}
}
