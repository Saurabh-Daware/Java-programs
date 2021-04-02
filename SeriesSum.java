import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		ResultMethod(n);
		sc.close();
	}

	static void ResultMethod(int n) {
		float result = 0;
		for (float i = 1; i <= n; i++) {
			result += 1 / i;
		}
		System.out.println("Result: " + result);
	}
}
