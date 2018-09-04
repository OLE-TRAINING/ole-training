package exercicio16e17e18e19;

public class Aluno {

	private String nome;
	private String rg;
	private int idade;
	
	public Aluno(String nome, String rg, int idade ) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}
	
	public boolean equals(Object obj) {
		if ((obj instanceof Aluno) && ((Aluno)obj).rg.equals(this.rg)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return Integer.parseInt(this.rg);
	}
	
	public String toString() {
		return nome + " " + rg + " " + idade;
	}
}
