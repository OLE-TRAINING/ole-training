package exercicios1a4;

public class TestandoAnimais {

	public static void main(String[] args) {
		/*Animal animal = AnimalFactory.getAnimal("pregui�a", "rex", 3);
		
		if (animal != null) {
			animal.emitirSom();
		} else {
			System.out.println("Animal requisitado n�o existe!");
		}
		
		Veterinario veterinario = new Veterinario();
		veterinario.examinar(new Cachorro("dog", 10));*/
		
		Zoologico zoologico = new Zoologico();
		zoologico.percorrendoJaulas();
	}
}
