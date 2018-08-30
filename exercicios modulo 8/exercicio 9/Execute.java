public class Execute {

	public static void main(String[] args) {
		System.out.println("Digite os lados do quadrado que quer criar:");
		//valores colocados para teste
		Quadrado quadrado = new Quadrado(-2, 3);
		showForma(quadrado);
		

	}

	public static void showForma(Quadrilatero figura) {
		System.out.println("Area=" + figura.calcularArea());
		System.out.println("Perimetro=" + figura.calcularPerimetro());
	}

}
