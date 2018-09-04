package exercicios5a7;

public class Empresa {

	private Funcionario funcionarios[] = new Funcionario[10];
	
	public double getCustoTotal() {
		double custoTotal = 0;
		
		for (Funcionario funcionario : funcionarios) {
			custoTotal += funcionario.getRendaTotal(); // modificada pelo exxercício 9, até o exercício 7 era getRenda();
		}
		return custoTotal;
	}
	
	public void imprimeDadosFuncionarios() {
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
	
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
}
