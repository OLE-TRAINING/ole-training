import java.util.ArrayList;

public class SalaDeAula {
	private int idSala;
	private ArrayList<Pessoa> alunos = new ArrayList<>();
    
	public SalaDeAula() {
		
	}
	
	public SalaDeAula(int id) {
		this.idSala=id;
	}
	
	//metodos getters e setter
	public int getIdSala() {
	   return this.idSala;	
	}
	
	public ArrayList<Pessoa> getAlunos(){
		return this.alunos;
	}
	
	public void adicionaAluno(Pessoa aluno) {
		if (isMax(alunos)) {
			System.out.println("Nao foi possivel adicionar o aluno na Turma pois ela está cheia!!");
		} else {
			alunos.add(aluno);
			System.out.println("Aluno adicionado na Turma com sucesso!!");
		}
	}

	public void showSala() {
		for (Pessoa aluno : alunos) {
			System.out.println("\nNome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("Cpf: " + aluno.getCpf());
		}
	}

	public boolean isMax(ArrayList<Pessoa> classe) {
			return classe.size() == 10;
	}

}
