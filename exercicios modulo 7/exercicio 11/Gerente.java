public class Gerente extends Funcionario {
	public Gerente(int n) {
		super.setNome(Integer.toString(n));
	}

	public float salario() {
		return (super.salario() + 1500);
	}

	public String toString() {
		return "Nome: " + super.getNome() + " Comissao: " + (salario() - super.salario()) + " Ganhos do Gerente: "
				+ salario();
	}
}
