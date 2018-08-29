package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;

/*
 * Factory para gerar funcionários
 */
public class FuncionarioFactory {

	public static Funcionario getFuncionario(String funcionario, Comissao comissao) {
		if (funcionario.equals("simples")) {
			return new FuncionarioSemEstudo(comissao);
		} else if (funcionario.equals("basico")) {
			return new FuncionarioEnsinoBasico(comissao);
		} else if (funcionario.equals("medio")) {
			return new FuncionarioEnsinoMedio(comissao);
		} else if (funcionario.equals("superior")) {
			return new FuncionarioGraduacao(comissao);
		}
		return null;
	}
}
