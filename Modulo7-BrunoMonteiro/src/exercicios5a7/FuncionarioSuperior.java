package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;
import exercicios5a7.renda.EnsinoBasico;
import exercicios5a7.renda.EnsinoMedio;
import exercicios5a7.renda.EnsinoSuperior;

public class FuncionarioSuperior extends Funcionario {

	public FuncionarioSuperior(Comissao comissao, int codigoFuncional, String nome, String escolaBasico, 
			String escolaMedio, String universidade) {
		super(comissao);
		setEscolaEnsinoBasico(escolaBasico);
		setEscolaEnsinoMedio(escolaMedio);
		setUniversidade(universidade);
		setNome(nome);
		setCodigoFuncional(codigoFuncional);
		setRenda(new EnsinoSuperior(new EnsinoMedio(new EnsinoBasico(this.getRenda()))));
	}
}
