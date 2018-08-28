package exercicio9;

import java.util.ArrayList;

public class SalaDeAula {

	private ArrayList<Aluno> alunos;
	private static int totalSalas = 0;
	private int idSalaDeAula; // criei esse atributo para ajudar no ex 17
	
	public SalaDeAula() {
		alunos = new ArrayList<Aluno>();
		this.idSalaDeAula = totalSalas;
		totalSalas++;
	}
	
	public void addAluno(Aluno a) {
		if(alunos.size() < 10) {
			alunos.add(a);
		} else {
			System.out.println("Limite de 10 alunos atingido!");
		}
	}
	
	public void removeAluno(Aluno a) {
		alunos.remove(a);
	}
	
	public boolean verificarSeAlunoExisteNaSala(String matricula) {
		for(Aluno a : alunos) {
			if(a.getMatricula() == matricula) {
				return true;
			}
		}
		return false;
	}
	
	public int getIdSalaDeAula() {
		return idSalaDeAula;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	public void listarMatriculaAlunos() {
		for(Aluno aluno : alunos) {
			System.out.println(aluno.getMatricula());
		}
	}
}
