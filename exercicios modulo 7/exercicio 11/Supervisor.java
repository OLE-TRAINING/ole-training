
public class Supervisor extends Funcionario{
	public Supervisor(int n) {
		super.setNome(Integer.toString(n));
	}
	public float salario() {
		return (super.salario()+600);
	}
	
	public String toString() {
		return "Nome: " + super.getNome() + " Comissao: " + (salario() - super.salario()) + " Ganhos do Supervisor: "
				+ salario();
	}
}
