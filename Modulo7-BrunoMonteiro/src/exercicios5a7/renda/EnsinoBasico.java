package exercicios5a7.renda;

public class EnsinoBasico extends RendaDecorator {

	public EnsinoBasico(Renda rendaASerDecorada) {
		super(rendaASerDecorada);
	}
	
	public double getValorRenda() {
		return super.getValorRenda() * 1.1;
	}
	
	public String getDescricao() {
		return super.getDescricao() + ", ensino básico";
	}
}
