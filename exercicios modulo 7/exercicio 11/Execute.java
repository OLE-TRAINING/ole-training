import java.util.ArrayList;

public class Execute {

	public static void main(String[] args) {
		Empresa zup = new Empresa();

		zup.funcionarioFactory(10);
		imprimeFuncionariosToString(zup.getFuncionarios());
		System.out.println("Gastos Zup=" + zup.calcularGastos());
	}

	public static void imprimeFuncionariosToString(ArrayList<Funcionario> funcionarios) {
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.toString());
		}
	}
}
