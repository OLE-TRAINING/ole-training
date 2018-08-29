public class FuncionarioSuperior extends FuncionarioMedio {
	private String universidade;
	// getters
		public String getUniversidade() {
			return this.universidade;
		}

		// setters
		public void setUniversidade(String universidade) {
			this.universidade = universidade;
		}
		
		public float renda() {
			return super.renda()*((float)200/100);
		}
}
