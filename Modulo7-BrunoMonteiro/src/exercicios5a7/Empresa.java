package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;
import exercicios5a7.exercicios8a11.ComissaoFactory;

public class Empresa {

	private Funcionario funcionarios[];
	
	public Empresa() {
		funcionarios = new Funcionario[10];
		setFuncionarios();
	}
	
	public void setFuncionarios() {
		String tipoFuncionarios[] = {"basico", "basico", "basico", "basico",
				"medio", "medio", "medio", "medio", "superior", "superior"};
		
		String tipoComissao[] = {"gerente", "supervisor", "supervisor", "vendedor", "vendedor",
				"vendedor", "vendedor", "vendedor", "vendedor", "vendedor"}; // Exercício 10
		
		for (int i = 0; i < 10; i++) {
			Comissao comissao = ComissaoFactory.getComissao(tipoComissao[i]); // variável para linha seguinte não ficar tão grande
			funcionarios[i] = FuncionarioFactory.getFuncionario(tipoFuncionarios[i], comissao);
		}
	}
	
	public double getCustoTotal() {
		double custoTotal = 0;
		
		for (Funcionario funcionario : funcionarios) {
			custoTotal += funcionario.getRendaTotal(); // modificada pelo exxercício 9, até o exercício 7 era getRenda();
		}
		return custoTotal;
	}
	
	public void imprimeDadosFuncionarios() {
		int i = 1;
		for (Funcionario funcionario : funcionarios) {
			funcionario.setNome("Funcionario " + i); // só para o nome não ser null
			System.out.println(funcionario);
			i++;
		}
	}
}
