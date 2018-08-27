package exercicio9;

public class Aluno {
	
	private String matricula;
	private String nome = "aaa";
	private int idade = 15;

	public Aluno(String matricula, String nome, int idade) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getMatricula() {
		return matricula;
	}
}
