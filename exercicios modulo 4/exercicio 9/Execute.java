public class Execute {

	public static void main(String[] args) {

		SalaDeAula salaA = new SalaDeAula();

		salaA.adicionaAluno(new Pessoa("Bruno1", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno2", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno3", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno4", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno5", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno6", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno7", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno8", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno9", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Bruno10", 22, "11111"));
		salaA.adicionaAluno(new Pessoa("Rodrigo", 22, "11111"));

		salaA.showSala();
	}

}
