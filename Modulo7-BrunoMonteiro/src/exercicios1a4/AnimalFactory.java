package exercicios1a4;

/* 
 * Uma factory para retornar instâncias dos animais especificados
 * */
public class AnimalFactory {

	public static Animal getAnimal(String animal, String nome, int idade) {
		if (animal.equals("cachorro")) {
			return new Cachorro(nome, idade);
		} else if (animal.equals("cavalo")) {
			return new Cavalo(nome, idade);
		} else if (animal.equals("preguica")) {
			return new Preguica(nome, idade);
		}
		return null;
	}
}
