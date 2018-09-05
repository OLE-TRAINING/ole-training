public class Execute {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		Vendedor func1 = new Vendedor();
		Supervisor func2 = new Supervisor();
		Gerente func3 = new Gerente();
		Empresa zup = new Empresa();

		System.out.println(func.salario());
		System.out.println(func1.salario());
		System.out.println(func2.salario());
		System.out.println(func3.salario());

		zup.funcionarioFactory(10);

		System.out.println("Gastos Zup=" + zup.calcularGastos());
	}
}
