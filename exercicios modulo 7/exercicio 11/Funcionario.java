public class Funcionario {
	private String nome;
	private String codigoFuncional;
	private float salario = 1000;
	private float rendaCalculada;

	public String getNome() {
		return this.nome;
	}

	public String getCodigoFuncional() {
		return this.codigoFuncional;
	}

	public float getRendaCalculada() {
		return this.rendaCalculada;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public float salario() {
		return this.salario;
	}

	public void setRenda() {
		this.rendaCalculada = this.salario();
	}
}
