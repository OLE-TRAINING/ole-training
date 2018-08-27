package exercicio17;

import exercicio9.Aluno;
import exercicio9.SalaDeAula;

public class TesteEscola {
	
	public static void main(String args[]) {
		
		Aluno a1 = new Aluno("mat1", "Bruno", 19);
		Aluno a2 = new Aluno("mat2", "Rodrigo", 19);
		Aluno a3 = new Aluno("mat3", "Rafael", 19);
		Aluno a4 = new Aluno("mat4", "Gabriel", 19);
		Aluno a5 = new Aluno("mat5", "Matheus", 19);
		Aluno a6 = new Aluno("mat6", "Danilo", 19);

		SalaDeAula sala1 = new SalaDeAula();
		SalaDeAula sala2 = new SalaDeAula();
		SalaDeAula sala3 = new SalaDeAula();
		
		Escola escola = new Escola("EscolaA", "222");
		
		sala1.addAluno(a1);
		sala1.addAluno(a3);
		
		sala2.addAluno(a2);
		sala2.addAluno(a5);
		
		sala3.addAluno(a4);
		sala3.addAluno(a6);
		
		escola.addSalaDeAula(sala1);
		escola.addSalaDeAula(sala2);
		escola.addSalaDeAula(sala3);
		
		System.out.println(escola.trocarAlunoDeSala(a6, sala1, sala2)); // a6 não está na sala1, retorn false
		escola.trocarAlunoDeSala(a1, sala1, sala2);
		
		System.out.println("\nMatricula dos alunos da sala 1:");
		sala1.listarMatriculaAlunos();
		
		System.out.println("\nMatricula dos alunos da sala 2:");
		sala2.listarMatriculaAlunos();
	}
}
