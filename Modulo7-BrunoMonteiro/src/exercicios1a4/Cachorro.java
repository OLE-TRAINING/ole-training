package exercicios1a4;

import exercicios1a4.correr.ConsegueCorrer;
import exercicios1a4.subirarvores.NaoConsegueSubirEmArvores;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		setCorrer(new ConsegueCorrer());
		setSobeEmArvores(new NaoConsegueSubirEmArvores());
	}

	@Override
	public void emitirSom() {
		System.out.println("Latindo");
	}
}
