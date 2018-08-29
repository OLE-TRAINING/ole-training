package exercicios5a7;

import exercicios5a7.exercicios8a11.ComissaoFactory;

public class Teste {

	public static void main(String[] args) {
		Funcionario f = new FuncionarioGraduacao(ComissaoFactory.getComissao("vendedor"));
		
		System.out.println("Renda: " + f.getRenda());
		
		Empresa empresa = new Empresa();
		System.out.println("Custo total da empresa: " + empresa.getCustoTotal());
		
		empresa.imprimeDadosFuncionarios();
	}
}