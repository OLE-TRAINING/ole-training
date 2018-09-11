package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;
import exercicios5a7.renda.EnsinoBasico;

public class FuncionarioBasico extends Funcionario {

	public FuncionarioBasico(Comissao comissao, int codigoFuncional, String nome, String escola) {
		super(comissao);
		setEscolaEnsinoBasico(escola);
		setNome(nome);
		setCodigoFuncional(codigoFuncional);
		setRenda(new EnsinoBasico(this.getRenda()));
	}
}
