import java.util.ArrayList;

public class Zoologico {
	private ArrayList<Animal> animalJaulas = new ArrayList<Animal>();

	public void colocaAnimalJaula(Animal animal) {
		if (animalJaulas.size() == 10) {
			System.out.println("nao possue jaulas disponiveis!!!");
		} else {
			animalJaulas.add(animal);
		}
	}

	public void goToJails() {
		for (Animal animal : animalJaulas) {
			animal.fazerBarulho();

			if ((animal instanceof Cachorro)) {
				((Cachorro) animal).setCorrer(true);
				System.out.println("Esta correndo!!");
			}

			if ((animal instanceof Cavalo)) {
				((Cavalo) animal).setCorrer(true);
				System.out.println("Esta correndo!!");
			}
		}
	}
}
