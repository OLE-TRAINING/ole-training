public class Execute {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		FuncionarioBasico func1 = new FuncionarioBasico();
		FuncionarioMedio func2 = new FuncionarioMedio();
		FuncionarioSuperior func3 = new FuncionarioSuperior();

		System.out.println(func.renda());
		System.out.println(func1.renda());
		System.out.println(func2.renda());
		System.out.println(func3.renda());
	}
}
