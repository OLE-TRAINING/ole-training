import java.util.ArrayList;

public class SalaDeAula {
	private ArrayList<Pessoa> alunos = new ArrayList<>();

	public void adicionaAluno(Pessoa aluno) {
		if (isMax(alunos)) {
			System.out.println("Nao foi possivel adicionar o aluno na Turma pois ela está cheia!!");
		} else {
			alunos.add(aluno);
			if (alunos.contains(aluno)) {
				System.out.println("Aluno adicionado na Turma com sucesso!!");
			} else {
				System.out.println("Aluno nao adicionado na turma.. existe algum problema no sistema!!");
			}
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
		if (classe.size() == 10) {
			return true;
		}
		return false;
	}

}
