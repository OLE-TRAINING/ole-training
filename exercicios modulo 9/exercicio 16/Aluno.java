public class Aluno {
	private String nome;
	private String rg;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean equals(Object obj) {
		if ((obj instanceof Aluno) && ((Aluno) obj).getRg().equals(this.getRg())) {
			return true;
		} else {
			return false;
		}
	}
}
