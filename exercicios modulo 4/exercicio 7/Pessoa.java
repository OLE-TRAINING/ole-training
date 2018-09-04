public class Pessoa {
	private int nome=1;
	private int idade=2;
	private int cpf=3;

	public Pessoa() {
		
	}
	
	public Pessoa(int nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	// metodos getters e setters
	public int getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setNome(int Nome) {
		this.nome = Nome;
	}

	public void setIdade(int Idade) {
		this.idade = Idade;
	}

	public void setCpf(int Cpf) {
		this.nome = Cpf;
	}
}
