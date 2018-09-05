public class Animal {
	private String nome;
	private int idade;
	private String som;

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public String getSom() {
		return this.som;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String toString() {
		return "\nNome:" + this.nome + "\nIdade:" + this.idade + "\nSom:" + this.som;
	}

	public void fazerBarulho() {
		System.out.println(som);
	}
}
