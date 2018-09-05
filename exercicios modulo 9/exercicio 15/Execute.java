import java.util.HashSet;
import java.util.Set;

public class Execute {
	public static void main(String[] args) {
		Set<ContaCorrente> hashSet = new HashSet<ContaCorrente>();

		hashSet.add(new ContaCorrente(123, 22, "Araguari", "cpf1"));
		hashSet.add(new ContaCorrente(122, 123, "Araguari", "cpf2"));
		hashSet.add(new ContaCorrente(1223, 2122, "Araguari", "cpf3"));
		hashSet.add(new ContaCorrente(123, 22, "Araguari", "cpf4")); // equals detecta cpf1 = cpf4
		hashSet.add(new ContaCorrente(1123, 242, "Araguari", "cpf5"));

		for (ContaCorrente conta : hashSet) {
			System.out.println();
			System.out.println("Agencia=" + conta.getAgencia());
			System.out.println("Numero=" + conta.getNumero());
			System.out.println("Nome=" + conta.getNome());
			System.out.println("Cpf=" + conta.getCpf());
		}
	}
}
