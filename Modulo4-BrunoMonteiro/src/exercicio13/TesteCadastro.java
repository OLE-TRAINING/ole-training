package exercicio13;

import exercicios7e8e11e12.Pessoa;

public class TesteCadastro {
	
	public static void main(String[] args) {
		
		CadastroPessoas cadastro = new CadastroPessoas();
		
		Pessoa p = new Pessoa("Bruno", "111", 20);
		cadastro.addPessoa(p);
	}

}
