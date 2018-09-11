package exercicios1a4;

public class TestandoAnimais {

	public static void main(String[] args) {
		// Exercício 2
		AnimalFactory.getAnimal("cachorro", "rex", 10).emitirSom();
		AnimalFactory.getAnimal("cavalo", "ponga", 10).emitirSom();
		AnimalFactory.getAnimal("preguica", "preguica", 10).emitirSom();
		
		// Exercício 3
		Veterinario vet = new Veterinario();
		vet.examinar(AnimalFactory.getAnimal("cachorro", "bobby", 14));
		
		// Exercício 4
		Zoologico zoologico = new Zoologico();
		preenchendoJaulas(zoologico);
		zoologico.percorrendoJaulas();
	}
	
	public static void preenchendoJaulas(Zoologico zoo) {
		String animais[] = {"cavalo", "cachorro", "cachorro", "cachorro", 
				"preguica", "cavalo", "cavalo", "cachorro", "preguica", "preguica"};
		
		Jaula jaulas[] = new Jaula[10];
		for (int i = 0; i < 10; i++) {
			jaulas[i] = new Jaula();
			jaulas[i].addAnimal(AnimalFactory.getAnimal(animais[i], "", 5));
		}
		zoo.setJaulas(jaulas);
	}
}
