package exercicio13;

import java.util.ArrayList;

import exercicios7e8e11e12.Pessoa;

public class CadastroPessoas {
	
	private ArrayList<Pessoa> pessoas;
	
	public CadastroPessoas() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void addPessoa(Pessoa p) {
		if(pessoas.size() < 100) {
			pessoas.add(p);
		} else {
			System.out.println("Limite de 100 pessoas extrapolado!");
		}
	}
	
	public void excluirPessoa(Pessoa p) {
		pessoas.remove(p);
	}

}
