package exercicio13;

public class Aluno {

	private int matricula;
	private String nome;
	private int idade;  
	
	public Aluno(int matricula, String nome, int idade) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula) {
			return false;
		}
		return true;
	}
}