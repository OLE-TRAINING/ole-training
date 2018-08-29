import java.util.ArrayList;

public class Execute {

	public static void main(String[] args) {
		Escola escola = new Escola();
		
		lotaEscola(escola);
		
	}
	
	
	//adicionar total+1 para teste
	public static void lotaSala(SalaDeAula sala) {
		
		System.out.println("Lotando sala de id:"+sala.getIdSala());
		for(int i=0;i<=10;i++) {
			sala.adicionaAluno(new Pessoa(Integer.toString(i),i,Integer.toString(i+12)));	
		}
	}
	
	public static void lotaEscola(Escola escola) {
		
		for(int i=0;i<=20;i++) {
			System.out.println("\nCriando sala de id:"+(i+1));
			escola.adicionaSala(new SalaDeAula(i+1));
		}
		
		System.out.println("\nAgora adicionando alunos nas Salas:");
		ArrayList<SalaDeAula> salas = new ArrayList<>();
		salas = escola.getSalas();
		for(SalaDeAula sala : salas) {
			lotaSala(sala);
		}
	}
	

}
