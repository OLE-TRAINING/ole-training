public class FuncionarioMedio extends FuncionarioBasico {
	private String escola;

	public String getEscola() {
		return this.escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public float renda() {
		return super.renda() * ((float) 150 / 100);
	}
}
