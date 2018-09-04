package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;

public class FuncionarioSemEstudo extends Funcionario {

	public FuncionarioSemEstudo(Comissao comissao, int codigoFuncional, String nome) {
		super(comissao);
		setNome(nome);
		setCodigoFuncional(codigoFuncional);
	}
}
