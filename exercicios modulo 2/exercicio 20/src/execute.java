import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("digite a altura da forma:");
		int height = s.nextInt();

		writeForm1(height);

		writeForm2(height);

		writeForm3(height);

		writeForm4(height);
	}

	public static void writeForm1(int h) {

		System.out.println();

		for (int row = 0; row < h + 1; row++) {

			writeRowType1(row);

			System.out.println();
		}
	}

	public static void writeForm2(int height) {

		for (int row = height; row != 0; row--) {

			writeRowType1(row);

			System.out.println();
		}
	}

	public static void writeRowType1(int row) {
		for (int column = 0; column < row; column++) {
			System.out.print("*");
		}
	}

	public static void writeForm3(int height) {

		System.out.println();

		for (int row = 0; row < height; row++) {

			writeRowType3(row, height);

			System.out.println();
		}
	}

	public static void writeRowType3(int row, int height) {
		for (int column = height - 1; column >= 0; column--) {
			if (column > row) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
	}

	public static void writeForm4(int height) {

		for (int row = 0; row < height; row++) {
			writeRowType4(row, height);

			System.out.println();
		}
	}

	public static void writeRowType4(int row, int height) {
		for (int column = 0; column < height; column++) {
			if (column >= row) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
	}
}