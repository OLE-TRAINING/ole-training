public class FuncionarioBasico extends Funcionario {
	private String escola;

	// getters
	public String getEscola() {
		return this.escola;
	}

	// setters
	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	public float renda() {
		return super.renda()*((float)110/100);
	}
}
