public class Funcionario {
	private String nome;
	private String codigoFuncional;
	private float rendaBasica = 1000;

	public String getNome() {
		return this.nome;
	}

	public String getCodigoFuncional() {
		return this.codigoFuncional;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public float renda() {
		return this.rendaBasica;
	}
}
