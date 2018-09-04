package exercicios5a7.renda;

public class EnsinoSuperior extends RendaDecorator {
	
	public EnsinoSuperior(Renda rendaASerDecorada) {
		super(rendaASerDecorada);
	}
	
	public double getValorRenda() {
		return super.getValorRenda() * 2;
	}
	
	public String getDescricao() {
		return super.getDescricao() + ", ensino superior";
	}
}
