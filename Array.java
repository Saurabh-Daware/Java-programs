package fundamentals;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//initialize array
		
		System.out.println("What do you want to be size of your array? :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; ++i) {
			System.out.println("Enter element "+(i+1)+" :");
			arr[i] = sc.nextInt();
		}
		
		System.out.printf("The array you entered is: [ ");		
		for(int items: arr) {
			System.out.print(items+" ");
		}
		System.out.print("]");

	}

}
