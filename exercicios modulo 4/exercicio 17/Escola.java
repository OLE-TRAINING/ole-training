import java.util.ArrayList;

public class Escola {
	private String nome;
	private String cnpj;
	private ArrayList<SalaDeAula> salas = new ArrayList<>();
	
	// getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
    
	public ArrayList<SalaDeAula> getSalas(){
		return this.salas;
	}
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
	//demias metodos
	public void adicionaSala(SalaDeAula sala) {
		if (isMax(salas)) {
			System.out.println("Nao foi possivel adicionar a sala na escola pois ela está cheia!!");
		} else {
			salas.add(sala);
			System.out.println("Sala adicionada na Escola com sucesso!!");
		}
	}

	public boolean isMax(ArrayList<SalaDeAula> todasSala) {
		return todasSala.size() >= 20;
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
