package exercicios1a4;

import exercicios1a4.correr.NaoConsegueCorrer;
import exercicios1a4.subirarvores.ConsegueSubirEmArvores;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		setCorrer(new NaoConsegueCorrer());
		setSobeEmArvores(new ConsegueSubirEmArvores());
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Qualquer que seja o barulho emitido por um bicho preguiça");
	}
}
