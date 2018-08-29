
public class Vendedor extends Funcionario{
	public Vendedor(int n) {
		super.setNome(Integer.toString(n));
	}
	public float salario() {
		return (super.salario()+250);
	}
	
	public String toString() {
		return "Nome: " + super.getNome() + " Comissao: " + (salario() - super.salario()) + " Ganhos do Vendedor: "
				+ salario();
	}
}
