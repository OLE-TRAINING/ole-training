package exercicios1a4;

public class Zoologico {

	private Jaula jaulas[] = new Jaula[10];
	
	public void percorrendoJaulas() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Sala " + (i + 1) + ":\n");

			for (Animal animal : jaulas[i].getAnimais()) {
				System.out.print("\t");
				animal.emitirSom();
				System.out.print("\t");
				animal.correr();
			}
		}
	}
	
	public void setJaulas(Jaula[] jaulas) {
		this.jaulas = jaulas;
	}
}
