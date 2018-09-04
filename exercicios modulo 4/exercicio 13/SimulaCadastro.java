import java.util.ArrayList;

public class SimulaCadastro {

	private ArrayList<Pessoa> individuos = new ArrayList<>();

	public void adicionaCadastro(Pessoa individuo) {
		if (isMax(individuos)) {
			System.out.println("Nao foi possivel adicionar o individuo pois o cadastro está cheio!!");
		} else {
			individuos.add(individuo);
				System.out.println(individuos.size()+" individuos(o) cadastrados(o) com sucesso!!");
		}
	}
	
	public void retiraCadastro(Pessoa individuo) {
		if (isNull(individuos)) {
			System.out.println("Nao foi possivel retirar o individuo pois o cadastro está vazio!!");
		} else {
			individuos.remove(individuo);
			System.out.println("individuo retirado com sucesso, quantidade de individuos atualmente:"+individuos.size());
		}
	}

	public void showSimulaçao() {
		for (Pessoa individuo : individuos) {
			System.out.println("\nNome: " + individuo.getNome());
			System.out.println("Idade: " + individuo.getIdade());
			System.out.println("Cpf: " + individuo.getCpf());
			System.out.println("Endereço: " + individuo.getEndereço().getEstado());
			System.out.print("," + individuo.getEndereço().getCidade());
			System.out.print("," + individuo.getEndereço().getBairro());
			System.out.print("," + individuo.getEndereço().getCep());
			System.out.print("," + individuo.getEndereço().getTelefone());
			System.out.print("," + individuo.getEndereço().getCep());
			System.out.print("," + individuo.getEndereço().getTelefone());
		}
	}

	public boolean isMax(ArrayList<Pessoa> pessoas) {
			return pessoas.size() == 100;
	}
	
	private boolean isNull(ArrayList<Pessoa> pessoas) {
			return pessoas.size() == 0;
	}

}
