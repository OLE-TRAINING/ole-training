package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;

public class FuncionarioEnsinoBasico extends FuncionarioSemEstudo {

	private String escolaBasico;
	
	public FuncionarioEnsinoBasico(Comissao comissao) {
		super(comissao);
		setRenda(getRenda() * 1.1);
	}
}
