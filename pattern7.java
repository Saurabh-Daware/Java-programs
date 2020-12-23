package loops;

public class Pattern7 {
	
	public static void main(String[] args) {
		
		int n = 5;
		for(int i = 0; i <= n; ++i) {
			
			for(int j = 0; j < (n -i) ; ++j) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= (i * 2) + 1; ++j) {
				System.out.print("*");
				if(j == i )System.out.print("O");
			}
			System.out.println();
		}
	}

}
