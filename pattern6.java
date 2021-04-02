public class Pattern6 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j)
					System.out.print("O ");
				else
					System.out.print("X ");
			}
			System.out.println();
		}

	}

}
