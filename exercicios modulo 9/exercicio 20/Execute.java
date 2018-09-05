public class Execute {

	public static void main(String[] args) {
		ExercicioSix exercicio6 = new ExercicioSix();
		ExercicioSeven exercicio7 = new ExercicioSeven();
		ExercicioSix exercicio6ComRepeticao = new ExercicioSix();
		ExercicioSeven exercicio7ComRepeticao = new ExercicioSeven();
		int n = 4;

		exercicio6.adicionaAlunosList(n);
		exercicio7.adicionaAlunosHash(n);
		exercicio6.mostraAlunosList();
		exercicio7.mostraAlunosHash();
		System.out.println("Executando agora Testes com Repetiçao de valores:");
		exercicio6ComRepeticao.adicionaAlunosList(n);
		exercicio6ComRepeticao.adicionaAlunosList(n);
		exercicio7ComRepeticao.adicionaAlunosHash(n);
		exercicio7ComRepeticao.adicionaAlunosHash(n);
		exercicio6ComRepeticao.mostraAlunosList();
		exercicio7ComRepeticao.mostraAlunosHash();
	}
}
