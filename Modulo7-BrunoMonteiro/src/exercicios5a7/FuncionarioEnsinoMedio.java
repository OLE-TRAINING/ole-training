package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

	private String escolaMedio;
	
	public FuncionarioEnsinoMedio(Comissao comissao) {
		super(comissao);
		setRenda(getRenda() * 1.5);
	}
}
