package exercicio20;

public class Asteriscos {
	
	public static void main(String args[]) {
		
		int asteriscos = 17;
		
		for(int i = 0; i <= asteriscos; i++) {
			for(int j = 0; j < i; j++)
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println();
		for(int i = asteriscos; i >= 0; i--) {
			for(int j = 0; j < i; j++)
				System.out.print("*");
			
			System.out.println();
		}

		for(int i = asteriscos; i > 0; i--) {
			for(int j = asteriscos-1; j >= i; j--)
				System.out.print(" ");
			
			for(int k = 0; k < i; k++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for(int i = 0; i <= asteriscos; i++) {
			for(int j = asteriscos-1; j >= i; j--)
				System.out.print(" ");
			
			for(int k = 0; k < i; k++)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
