package exercicio16e17e18e19;

import java.util.HashSet;
import java.util.Set;

//Exercício 17: Usaria a interface Set (já trabalha desclassificando duplicatas).
public class AlunosSet {

	public static void main(String[] args) {
		Set<Aluno> alunos = new HashSet<Aluno>();
		adicionarAlunos(alunos);
		imprimeAlunos(alunos);
	}
	
	public static void adicionarAlunos(Set<Aluno> alunos) {
		alunos.add(new Aluno("Bruno", "123", 19));
		alunos.add(new Aluno("Bruno", "123", 19));
		alunos.add(new Aluno("Ricardo", "567", 19));
		alunos.add(new Aluno("Carlos", "123", 19));
		alunos.add(new Aluno("Rodrigo", "567", 19));
		alunos.add(new Aluno("Marcelo", "897", 19));
		alunos.add(new Aluno("Rodolfo", "234", 19));
		alunos.add(new Aluno("Eduardo", "543", 19));
		alunos.add(new Aluno("Guilherme", "123", 19));
		alunos.add(new Aluno("Henrique", "678", 19));
	}
	
	// Exercício 19: sem hashCode sobrescrito aceita 2 rgs iguais, com hashCode sobrescrito não.
	public static void imprimeAlunos(Set<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
