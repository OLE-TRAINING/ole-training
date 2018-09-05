import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado que quer criar:");
		Quadrado quadrado = new Quadrado(s.nextInt());
		showForma(quadrado);
		System.out.println("Digite os dois lado do Retangulo que quer criar:");
		Retangulo retangulo = new Retangulo(s.nextInt(), s.nextInt());
		showForma(retangulo);
	}

	public static void showForma(Quadrilatero figura) {
		System.out.println("Area=" + figura.calcularArea());
		System.out.println("Perimetro=" + figura.calcularPerimetro());
	}
}
