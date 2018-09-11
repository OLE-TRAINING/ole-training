package exercicios1a4;

import exercicios1a4.correr.Correr;
import exercicios1a4.subirarvores.SobeEmArvores;

/* 
 * Resolvi usar o design pattern Strategy para subir em árvores e correr. Como alguns podem e outros não,
 * achei essa a melhor solução para o problema e evita ficar sobrescrevendo métodos (especialmente se aumentar
 * a quantidade de animais). Para o som, como (acredito que) todos os animais façam sons diferentes, resolvi criar
 * apenas um método abstrato para ser sobrescrito depois. 
 * */

public abstract class Animal {

	private String nome;
	private int idade;
	private SobeEmArvores sobeEmArvores;
	private Correr correr;

	public Animal(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public void correr() {
		correr.correr();
	}
	
	public void subirEmArvores() {
		sobeEmArvores.subirEmArvores();
	}
	
	public abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public SobeEmArvores getSobeEmArvores() {
		return sobeEmArvores;
	}

	public void setSobeEmArvores(SobeEmArvores sobeEmArvores) {
		this.sobeEmArvores = sobeEmArvores;
	}

	public Correr getCorrer() {
		return correr;
	}

	public void setCorrer(Correr correr) {
		this.correr = correr;
	}
}
