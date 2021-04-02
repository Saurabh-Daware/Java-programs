import java.io.*;

public class Stack1 {

	int a[], top, n;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Stack1() throws IOException {

		System.out.println("Enter Array Size: ");
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		top = -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int option;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack1 s = new Stack1();

		do {
			System.out.println(
					"Menu:\n" + "	1. Push\n" + "	2. Pop\n" + "	3. Peek\n" + "	4. Display\n" + "	5. Exit\n");

			option = Integer.parseInt(br.readLine());
			switch (option) {
				case 1:
					s.push();
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.peek();
					break;
				case 4:
					s.display();
					break;
				case 5:
					System.out.println("Thank you for using this program!");
					return;
			}
		} while (true);
	}

	void push() throws IOException {

		int x;
		if (top == n - 1) {
			System.out.println("Stack overflow");
		} else {
			System.out.println("Enter value to be inserted: ");
			x = Integer.parseInt(br.readLine());
			++top;
			a[top] = x;
			System.out.println("Value pushed successfully\n");
		}
	}

	void pop() {
		if (top == -1) {
			System.out.println("Stack underflow");
		} else {
			System.out.println("Value popped = " + a[top] + "\n");
			--top;
		}
	}

	void peek() {
		if (top == -1) {
			System.out.println("Stack empty");
		} else {
			System.out.println("Top value = " + a[top] + "\n");
		}
	}

	void display() {
		if (top == -1) {
			System.out.println("Stack empty");
		} else {
			System.out.print("Your Current Stack => [ ");

			for (int items : a) {
				System.out.print(items + " ");
			}
			System.out.println("]");
		}
	}
}
