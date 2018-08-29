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
				"vendedor", "vendedor", "vendedor", "vendedor", "vendedor"}; // Exerc�cio 10
		
		for (int i = 0; i < 10; i++) {
			Comissao comissao = ComissaoFactory.getComissao(tipoComissao[i]); // vari�vel para linha seguinte n�o ficar t�o grande
			funcionarios[i] = FuncionarioFactory.getFuncionario(tipoFuncionarios[i], comissao);
		}
	}
	
	public double getCustoTotal() {
		double custoTotal = 0;
		
		for (Funcionario funcionario : funcionarios) {
			custoTotal += funcionario.getRendaTotal(); // modificada pelo exxerc�cio 9, at� o exerc�cio 7 era getRenda();
		}
		return custoTotal;
	}
	
	public void imprimeDadosFuncionarios() {
		int i = 1;
		for (Funcionario funcionario : funcionarios) {
			funcionario.setNome("Funcionario " + i); // s� para o nome n�o ser null
			System.out.println(funcionario);
			i++;
		}
	}
}
