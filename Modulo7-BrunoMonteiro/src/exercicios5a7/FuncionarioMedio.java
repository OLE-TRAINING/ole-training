package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;
import exercicios5a7.renda.*;

public class FuncionarioMedio extends Funcionario {

	public FuncionarioMedio(Comissao comissao, int codigoFuncional, String nome, String escolaBasico, String escolaMedio) {
		super(comissao);
		setEscolaEnsinoBasico(escolaBasico);
		setEscolaEnsinoMedio(escolaMedio);
		setNome(nome);
		setCodigoFuncional(codigoFuncional);
		setRenda(new EnsinoMedio(new EnsinoBasico(this.getRenda())));
	}
}
