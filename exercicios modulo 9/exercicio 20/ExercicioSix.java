import java.util.ArrayList;
import java.util.List;

public class ExercicioSix {
	private List<Aluno> arrayList = new ArrayList<Aluno>();

	public void adicionaAlunosList(int n) {
		for (int i = 0; i < n; i++) {
			arrayList.add(new Aluno("Bruno " + Integer.toString(i), "123" + Integer.toString(i), i + 10));
		}
	}

	public void mostraAlunosList() {
		System.out.println("\nmostrando Alunos em ArrayList:");
		for (Aluno aluno : arrayList) {
			System.out.println("Nome:" + aluno.getNome());
			System.out.println("Rg:" + aluno.getRg());
			System.out.println("Idade:" + aluno.getIdade());
			System.out.println();
		}
	}
}
