import java.util.HashSet;
import java.util.Set;

public class Execute {
	public static void main(String[] args) {
		Set<Aluno> hashSet = new HashSet<Aluno>();
		hashSet.add(new Aluno("Nome1", "3", 11));
		hashSet.add(new Aluno("Nome2", "3", 12));
		hashSet.add(new Aluno("Nome3", "22", 13));
		hashSet.add(new Aluno("Nome4", "33", 14));
		hashSet.add(new Aluno("Nome5", "44", 15));
		hashSet.add(new Aluno("Nome6", "55", 16));
		hashSet.add(new Aluno("Nome7", "12345", 17));

		for (Aluno aluno : hashSet) {
			System.out.println("\nNome: " + aluno.getNome());
			System.out.println("Rg: " + aluno.getRg());
			System.out.println("Idade: " + aluno.getIdade());
		}
	}
}
