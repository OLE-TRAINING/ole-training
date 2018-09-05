public class FuncionarioSuperior extends FuncionarioMedio {
	private String universidade;

	public String getUniversidade() {
		return this.universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public float renda() {
		return super.renda() * ((float) 200 / 100);
	}
}
