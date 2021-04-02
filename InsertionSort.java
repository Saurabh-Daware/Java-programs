public class InsertionSort {

	public static void main(String[] args) {

		int a[] = { 6, 4, 35, 2, 1, -4, 23, 120, 3 };

		int len = a.length;

		for (int i = 1; i < len; ++i) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		for (int items : a) {
			System.out.print(" " + items);
		}
	}

}
