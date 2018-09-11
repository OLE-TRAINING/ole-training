package exercicios5a7;

import exercicios5a7.exercicios8a11.Comissao;
import exercicios5a7.renda.*;

public class Funcionario {

	private Comissao comissao;
	private Renda renda;
	private int codigoFuncional;
	private String nome;
	private String escolaEnsinoBasico;
	private String escolaEnsinoMedio;
	private String universidade;
	
	public Funcionario(Comissao comissao) {
		this.comissao = comissao;
		this.renda = new RendaBasica();
	}
	
	public int getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(int codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public String getEscolaEnsinoBasico() {
		return escolaEnsinoBasico;
	}

	public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
		this.escolaEnsinoBasico = escolaEnsinoBasico;
	}

	public String getEscolaEnsinoMedio() {
		return escolaEnsinoMedio;
	}

	public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
		this.escolaEnsinoMedio = escolaEnsinoMedio;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	
	public double getRendaTotal() {
		return renda.getValorRenda() + comissao.getComissao();
	}
	
	public Comissao getComissao() {
		return comissao;
	}

	public void setComissao(Comissao comissao) {
		this.comissao = comissao;
	}
	
	public void setRenda(Renda renda) {
		this.renda = renda;
	}
	
	public Renda getRenda() {
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
