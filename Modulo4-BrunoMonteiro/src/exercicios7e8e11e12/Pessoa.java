package exercicios7e8e11e12;

import exercicio10.Endereco;

/* Exercicio 7 */
public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private Endereco endereco; /* Exercicio 11 */

	/* Exercicio 12 */
	public Pessoa(String nome, String cpf, int idade) {
		setNome(nome);
		setCpf(cpf);
		setIdade(idade);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void imprimeDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Cpf: " + cpf);
		System.out.println("Idade: " + idade);
	}
}
