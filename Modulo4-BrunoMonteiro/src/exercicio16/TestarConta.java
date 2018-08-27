package exercicio16;

import exercicios7e8e11e12.Pessoa;

public class TestarConta {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Bruno", "111", 19);
		Conta conta = new Conta(p, 10, 2000, 150);

		conta.sacar(3000);
		conta.sacar(1000);
		
		conta.depositar(2000);
		System.out.println(conta.getSaldo());
	}

}
