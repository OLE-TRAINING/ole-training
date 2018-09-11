package exercicios5a7;

import exercicios5a7.exercicios8a11.*;

public class Teste {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		setFuncionarios(empresa);
		System.out.println("Custo total da empresa: " + empresa.getCustoTotal());
		
		empresa.imprimeDadosFuncionarios();
	}
	
	public static void setFuncionarios(Empresa empresa) {
		Funcionario funcionarios[] = new Funcionario[10];
		
		// Exercícios 7 e 10
		funcionarios[0] = new FuncionarioBasico(new Gerente(), 1, "Bruno", "EscolaA");
		funcionarios[1] = new FuncionarioBasico(new Supervisor(), 2, "Rafael", "EscolaB");
		funcionarios[2] = new FuncionarioBasico(new Supervisor(), 3, "André", "EscolaC");
		funcionarios[3] = new FuncionarioBasico(new Vendedor(), 4, "Felipe", "EscolaD");
		funcionarios[4] = new FuncionarioMedio(new Vendedor(), 5, "Gabriel", "EscolaE", "Medio1");
		funcionarios[5] = new FuncionarioMedio(new Vendedor(), 6, "Julio", "EscolaF", "Medio2");
		funcionarios[6] = new FuncionarioMedio(new Vendedor(), 7, "Tulio", "EscolaG", "Medio3");
		funcionarios[7] = new FuncionarioMedio(new Vendedor(), 8, "Marcelo", "EscolaH", "Medio4");
		funcionarios[8] = new FuncionarioSuperior(new Vendedor(), 9, "Otavio", "EscolaH", "Medio4", "UniA");
		funcionarios[9] = new FuncionarioSuperior(new Vendedor(), 10, "Marcos", "EscolaH", "Medio4", "UniB");
		
		empresa.setFuncionarios(funcionarios);
	}
}