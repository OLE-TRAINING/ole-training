package exercicios5a7.exercicios8a11;

public class Gerente implements Comissao {

	@Override
	public double getComissao() {
		return 1500;
	}
	
	public String toString() {
		return "gerente";
	}
}
