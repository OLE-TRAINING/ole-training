import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario> empregados = new ArrayList<Funcionario>();

	// getters
	public ArrayList<Funcionario> getFuncionarios() {
		return this.empregados;
	}

	public void adicionaFuncionario(Funcionario funcionario) {
		if (empregados.size() == 10) {
			empregados.add(funcionario);
			System.out.println("Funcionario adicionado com sucesso!!");
		}
	}

	public void funcionarioFactory(int n) {
		for (int i = 0; i < n; i++) {
			if (i < (n * (7.0 / 10))) {
				empregados.add(new Vendedor(i));
				System.out.println("Funcionario Vendedor criado");
			} else if ((i >= (n * (7.0 / 10)) && (i < (n * (9.0 / 10))))) {
				empregados.add(new Supervisor(i));
				System.out.println("Funcionario Supervisor criado");
			} else if ((i >= (n * (9.0 / 10)) && (i < n))) {
				empregados.add(new Gerente(i));
				System.out.println("Funcionario Gerente criado");
			}
		}
	}

	public float calcularGastos() {
		float soma = 0;
		for (Funcionario funcionario : empregados) {
			soma += funcionario.salario();
		}
		return soma;
	}
}
