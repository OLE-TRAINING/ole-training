package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {

	private String universidade;
	
	public FuncionarioGraduacao(Comissao comissao) {
		super(comissao);
		setRenda(getRenda() * 2);
	}
}
