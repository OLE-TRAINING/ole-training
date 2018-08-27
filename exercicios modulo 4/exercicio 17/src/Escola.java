import java.util.ArrayList;

public class Escola {
	private String nome;
	private String cnpj;
	private ArrayList<SalaDeAula> salas = new ArrayList<>();

	public void adicionaAluno(SalaDeAula sala) {
		if (isMax(salas)) {
			System.out.println("Nao foi possivel adicionar a sala na escola pois ela está cheia!!");
		} else {
			salas.add(sala);
			if (salas.contains(sala)) {
				System.out.println("Sala adicionada na Escola com sucesso!!");
			} else {
				System.out.println("Sala nao adicionado na escola.. existe algum problema no sistema!!");
			}
		}
	}

	public boolean isMax(ArrayList<SalaDeAula> todasSala) {
		if (todasSala.size() == 20) {
			return true;
		}
		return false;
	}

	public void moverAlunoDeUmaSalaParaOutrA(Pessoa aluno, SalaDeAula salaA) {

		for (SalaDeAula sala : salas) {
			if (sala.getAlunos().contains(aluno)) {
				sala.getAlunos().remove(aluno);
			} else {
				System.out.println("Aluno nao emcomtrado!!!");
			}
		}

		for (SalaDeAula sala : salas) {
			if (sala.getIdSala() == salaA.getIdSala()) {
				sala.getAlunos().add(aluno);
			} else {
				System.out.println("Sala nao emcontrada!!!");
			}
		}

	}
}
