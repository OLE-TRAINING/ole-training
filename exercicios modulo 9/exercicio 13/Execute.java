import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Execute {
	public static void main(String[] args) {
		Map<Integer, Aluno> alunosMap = new HashMap<>();
		Set<Aluno> alunosSet = new HashSet<>();
		Aluno aluno = new Aluno();

		adicionaAlunosMap(alunosMap);
		adicionaAlunosSet(alunosSet);

		// inicio da contagem do tempo para a pesquisa do Map
		long inicio = System.currentTimeMillis();

		aluno = pesquisaAlunosMap(alunosMap, "Bruno11111");

		// fim da contagem do tempo para a pesquisa do Map
		long fim = System.currentTimeMillis();

		showAluno(aluno);
		System.out.println("tempo decorrido para achar o aluno no HashMap:" + (fim - inicio) + " ms");

		// inicio da contagem do tempo para a pesquisa do Set
		inicio = System.currentTimeMillis();

		aluno = pesquisaAlunosSet(alunosSet, "Bruno11111");

		// fim da contagem do tempo para a pesquisa do Set
		fim = System.currentTimeMillis();

		showAluno(aluno);
		System.out.println("tempo decorrido para achar o aluno no HashSet:" + (fim - inicio) + " ms");
	}

	public static void adicionaAlunosMap(Map<Integer, Aluno> alunosMap) {
		for (int i = 0; i < 20000; i++) {
			alunosMap.put(i, new Aluno("Bruno" + Integer.toString(i), "2" + Integer.toString(i), i + 1));
		}
	}

	public static void adicionaAlunosSet(Set<Aluno> alunosSet) {
		for (int i = 0; i < 20000; i++) {
			alunosSet.add(new Aluno("Bruno" + Integer.toString(i), "2" + Integer.toString(i), i + 1));
		}
	}

	public static Aluno pesquisaAlunosMap(Map<Integer, Aluno> alunosMap, String nome) {
		for (int i = 0; i < 20000; i++) {
			if (alunosMap.get(i).getNome().equals(nome)) {
				return alunosMap.get(i);
			}
		}
		return null;
	}

	public static Aluno pesquisaAlunosSet(Set<Aluno> alunosSet, String nome) {
		for (Aluno aluno : alunosSet) {
			if (aluno.getNome().equals(nome)) {
				return aluno;
			}
		}
		return null;
	}

	public static void showAluno(Aluno aluno) {
		System.out.println("\nNome:" + aluno.getNome());
		System.out.println("Rg:" + aluno.getRg());
		System.out.println("Idade:" + aluno.getIdade());
	}
}
