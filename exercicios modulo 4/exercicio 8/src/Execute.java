
public class Execute {

	public static void main(String[] args) {
		
		Pessoa fulano = new Pessoa("Bruno",18,"118212881");
		
		Pessoa ciclano = new Pessoa("Bruna",24,"121212121");
		
		System.out.println("Nome de Fulano="+fulano.getNome()+"\nIdade de Fulano="+fulano.getIdade()+"\nCpf de Fulano="+fulano.getCpf());
		System.out.println("\nNome de Ciclano="+ciclano.getNome()+"\nIdade de Ciclano="+ciclano.getIdade()+"\nCpf de Ciclano="+ciclano.getCpf());
	    	

		
	}

}
