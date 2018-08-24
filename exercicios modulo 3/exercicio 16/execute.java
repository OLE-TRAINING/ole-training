public class execute {

	public static void main(String[] args) {

		int[] vet = new int[] { 23, 12, 55, 2, 7, 19, 3, 7, 65, 61 };
		int vet2[] = new int[10];
		int aux = 0;
		int auxIndex;

		for (int element = 9; element >= -1; element--) {
			if (element < 9) {
				vet2[element + 1] = aux;
			}

			aux = vet[0];
			auxIndex = 0;

			for (int i = 0; i <= element; i++) {
				if (aux < vet[i]) {
					aux = vet[i];
					auxIndex = i;
				}
			}

			if (element > 0) {

				vet[auxIndex] = vet[element];
				vet[element] = 0;// "delete no elemento"
			} else {
				vet[0] = 0;
			}

			showVets(vet, vet2, 10);
		}

		showVets(vet, vet2, 10);

	}

	public static void showVets(int vet[], int vet2[], int size) {
		System.out.print("\n--------------------------------\nV=");
		for (int element = 0; element < size; element++) {
			System.out.print(" " + vet[element]);
		}
		System.out.print("\nV2=");
		for (int element = 0; element < size; element++) {
			System.out.print(" " + vet2[element]);
		}
		System.out.println("\n--------------------------------\n");

	}
}