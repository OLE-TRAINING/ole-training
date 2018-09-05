public class FuncionarioBasico extends Funcionario {
	private String escola;

	public String getEscola() {
		return this.escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public float renda() {
		return super.renda() * ((float) 110 / 100);
	}
}
