package exercicios1a4;

import java.util.ArrayList;

public class Jaula {

	private ArrayList<Animal> animais = new ArrayList<Animal>();
	
	public void addAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	
	public void a() {
		System.out.println("AAAAAAAAAAA");
	}
}
