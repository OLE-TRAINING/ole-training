public class Execute {

	public static void main(String[] args) {

		GeradorAleatorio gerador = new GeradorAleatorio();
		int a = gerador.numeroAleatorio();
		int b = gerador.numeroAleatorio();

		System.out.println(a);
		System.out.println(b);
		System.out.println(Math.max(a, b));
	}
}
