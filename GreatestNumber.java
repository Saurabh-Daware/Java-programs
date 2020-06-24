package conditionalStatement;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,result;

		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 
		
		result = b > a ? b > c ? b : c : a > c ? a : c;
		
		System.out.println(result);
		
	}
	

}
