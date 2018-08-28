package exercicio17;

import java.util.ArrayList;

import exercicio9.Aluno;
import exercicio9.SalaDeAula;

public class Escola {

	private String nome;
	private String cnpj;
	private ArrayList<SalaDeAula> salas;

	public Escola(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		salas = new ArrayList<SalaDeAula>();
	}

	public void addSalaDeAula(SalaDeAula sala) {
		salas.add(sala);
	}

	public void removeSalaDeAula(SalaDeAula sala) {
		salas.remove(sala);
	}

	public boolean verificarExistenciaDaSalaNaEscola(int idSalaDeAula) {
		for (SalaDeAula sala : salas) {
			if (sala.getIdSalaDeAula() == idSalaDeAula) {
				return true;
			}
		}
		return false;
	}

	// criei todos esses boolean porque achei que ficaria mais fácil de ler e entender o método
	public boolean trocarAlunoDeSala(Aluno aluno, SalaDeAula salaAntiga, SalaDeAula salaNova) {
		boolean salaAntigaExiste = verificarExistenciaDaSalaNaEscola(salaAntiga.getIdSalaDeAula());

		if (salaAntigaExiste) {
			boolean alunoExiste = salaAntiga.verificarSeAlunoExisteNaSala(aluno.getMatricula());

			if (alunoExiste) {
				boolean salaNovaExiste = verificarExistenciaDaSalaNaEscola(salaNova.getIdSalaDeAula());

				if (salaNovaExiste) {
					salaAntiga.removeAluno(aluno);
					salaNova.addAluno(aluno);
					return true;
				}
			}
		}
		return false;
	}
}
