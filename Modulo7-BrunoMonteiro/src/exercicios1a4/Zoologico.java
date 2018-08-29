package exercicios1a4;

public class Zoologico {

	private Animal jaulas[];
	
	public Zoologico() {
		jaulas = new Animal[10];
		setJaulas();
	}
	
	public void setJaulas() {
		String animais[] = {"cavalo", "cachorro", "cachorro", "cachorro", 
				"preguica", "cavalo", "cavalo", "cachorro", "preguica", "preguica"};
		
		for (int i = 0; i < 10; i++) {
			jaulas[i] = AnimalFactory.getAnimal(animais[i], "", 5);
		}
	}
	
	public void percorrendoJaulas() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Sala " + (i + 1) + ":\n" + "\t");
			jaulas[i].emitirSom();
			System.out.print("\t");
			jaulas[i].correr();
		}
	}
}
