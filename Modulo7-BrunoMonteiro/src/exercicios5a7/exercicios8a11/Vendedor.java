package exercicios5a7.exercicios8a11;

public class Vendedor implements Comissao {

	@Override
	public double getComissao() {
		return 250;
	}
	
	public String toString() {
		return "vendedor";
	}
}
