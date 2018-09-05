import java.util.HashSet;
import java.util.Set;

public class ExercicioSeven {
	private Set<Aluno> hashSet = new HashSet<Aluno>();// Criacao do HashSet

	public void adicionaAlunosHash(int n) {
		for (int i = 0; i < n; i++) {
			hashSet.add(new Aluno("Bruno " + Integer.toString(i), "123" + Integer.toString(i), i + 10));
		}
	}

	public void mostraAlunosHash() {
		System.out.println("\nmostrando Alunos em HashSet:");
		for (Aluno aluno : hashSet) {
			System.out.println("\nNome:" + aluno.getNome());
			System.out.println("Rg:" + aluno.getRg());
			System.out.println("Idade:" + aluno.getIdade());
			System.out.println();
		}
	}
}
