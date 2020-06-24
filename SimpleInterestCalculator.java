package userInput;
import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle, rate and time:");
		int principle = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float simpleInterest = principle * rate * time / 100 ;
		
		System.out.println("Simple Interest is " + simpleInterest);
		

	}

}
