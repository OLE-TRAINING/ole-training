package exercicios12a15;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrenteEspecial conta = new ContaCorrenteEspecial(3000, 1000);
		
		try {
			conta.sacar(3500);
			System.out.println(conta.getLimiteCorrente());
			conta.sacar(700);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		conta.depositar(700);
		System.out.println("Limite corrente: " + conta.getLimiteCorrente());
		System.out.println("Saldo total: " + conta.getSaldoTotal());
	}
}