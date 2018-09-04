public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private Endereço endereço;

	/*
	 * tinha criado o construtor antes ai eu apenas copiei do exercicio anterior e
	 * apaguei o default
	 */
	public Pessoa(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	// metodos getters e setters
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public String getCpf() {
		return this.cpf;
	}

	public Endereço getEndereço() {
		return this.endereço;
	}

	public void setNome(String Nome) {
		this.nome = Nome;
	}

	public void setIdade(int Idade) {
		this.idade = Idade;
	}

	public void setCpf(String Cpf) {
		this.nome = Cpf;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
}
