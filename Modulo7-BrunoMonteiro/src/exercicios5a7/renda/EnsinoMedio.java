package exercicios5a7.renda;

public class EnsinoMedio extends RendaDecorator {
	
	public EnsinoMedio(Renda rendaASerDecorada) {
		super(rendaASerDecorada);
	}
	
	public double getValorRenda() {
		return super.getValorRenda() * 1.5;
	}
	
	public String getDescricao() {
		return super.getDescricao() + ", ensino médio";
	}
}
