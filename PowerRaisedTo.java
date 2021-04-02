import java.util.Scanner;

public class PowerRaisedTo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base number: ");
		int a = sc.nextInt();
		System.out.print("Enter number rased to: ");
		int b = sc.nextInt();
		Result(a, b);
		sc.close();
	}

	static void Result(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		System.out.println("Result is : " + result);
	}

}
