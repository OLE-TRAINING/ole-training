import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario> empregados = new ArrayList<Funcionario>();

	public void adicionaFuncionario(Funcionario funcionario) {
		if (empregados.size() == 10) {
			empregados.add(funcionario);
			System.out.println("Funcionario adicionado com sucesso!!");
		}
	}

	public void funcionarioFactory(int n) {
		for (int i = 0; i < n; i++) {
			if (i < (n * (4.0 / 10))) {
				empregados.add(new FuncionarioBasico());
				System.out.println("Funcionario basico criado");
			} else if ((i >= (n * (4.0 / 10)) && (i < (n * (8.0 / 10))))) {
				empregados.add(new FuncionarioMedio());
				System.out.println("Funcionario medio criado");
			} else {
				empregados.add(new FuncionarioSuperior());
				System.out.println("Funcionario superior criado");
			}
		}
	}

	public float calcularGastos() {
		float soma = 0;
		for (Funcionario funcionario : empregados) {
			soma += funcionario.renda();
		}
		return soma;
	}
}
