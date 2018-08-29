package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;

public abstract class Funcionario {

	private String nome;
	private int codigo;
	private double renda;
	private Comissao comissao;
	
	public Funcionario(Comissao comissao) {
		setComissao(comissao);
	}
	
	public double getRendaTotal() {
		return getRenda() + comissao.getComissao();
	}
	
	public Comissao getComissao() {
		return comissao;
	}

	public void setComissao(Comissao comissao) {
		this.comissao = comissao;
	}
	
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public double getRenda() {
		return this.renda;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return nome + ", " + comissao + ", " + getRendaTotal();
	}
}
