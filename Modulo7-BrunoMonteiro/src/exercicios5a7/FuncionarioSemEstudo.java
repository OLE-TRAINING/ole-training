package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;

public class FuncionarioSemEstudo extends Funcionario {

	public FuncionarioSemEstudo(Comissao comissao) {
		super(comissao);
		setRenda(1000);
	}
}
