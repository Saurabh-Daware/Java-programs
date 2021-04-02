import java.util.Scanner;

public class LeapYear {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a year: ");

		int year = sc.nextInt();

		isLeapYear(year);
	}

	private static void isLeapYear(int year) {
		boolean leapYear = false;

		if (year % 4 == 0) {
			leapYear = true;
			if (year % 100 == 0 && year % 400 != 0)
				leapYear = false;
		}

		if (leapYear)
			System.out.println(year + " is leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}

}
