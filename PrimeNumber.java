import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter Number here: ");
		int n = sc.nextInt();
		boolean isPrime = true;
		
		if(n<2) { isPrime = false;}
		for(int i = 2; i < n; i++) {
			if(n % i ==0) {
				isPrime = false;
				System.out.println("Number is not Prime");
				break;
			}else {
				System.out.println("Number is Prime");
				break;
			}
		}
	}
}
