
public class execute {

	public static void main(String[] parametros) {
		if (parametros != null) {
			System.out.println("Foram passados: " + parametros.length + " parametros");
			int matriz[][] = new int[4][4];

			System.out.println("Matriz passada:");
			for (int i = 0, aux = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					matriz[i][j] = Integer.parseInt(parametros[aux]);
					aux++;
					System.out.print(" " + matriz[i][j]);
				}
				System.out.println();
			}

			System.out.println("Matriz transposta:");
			for (int i = 3; i >= 0; i--) {
				for (int j = 0; j < 4; j++) {
					System.out.print(" " + matriz[j][i]);
				}
				System.out.println();
			}

		}
	}
}
