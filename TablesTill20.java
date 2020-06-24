package loops;

public class TablesTill20 {

	public static void main(String[] args) {

		for(int j = 1; j<=20; j++) {
			int tableof = j;
			for(int i=1; i<=10;i++) {
				
				System.out.print(tableof * i+" ");
		}
				System.out.println();
		}
	}

}
