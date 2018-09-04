public class Execute {

	public static void main(String[] parameters) {
		if (parameters != null && parameters.length <= 16) {

			System.out.println("Foram passados: " + parameters.length + " parametros");
			int matriz[][] = new int[4][4];

			System.out.println("Matriz passada:");
			for (int row = 0, aux = 0; row < 4; row++) {
				for (int column = 0; column < 4; column++) {
					matriz[row][column] = Integer.parseInt(parameters[aux]);
					aux++;
					System.out.print(" " + matriz[row][column]);
				}
				System.out.println();
			}

			System.out.println("Matriz transposta:");
			for (int row = 3; row >= 0; row--) {
				for (int column = 0; column < 4; column++) {
					System.out.print(" " + matriz[row][column]);
				}
				System.out.println();
			}

		}
	}
}
