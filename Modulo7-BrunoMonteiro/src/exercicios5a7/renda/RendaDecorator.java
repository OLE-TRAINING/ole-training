package exercicios5a7.renda;

public abstract class RendaDecorator implements Renda {

	protected Renda rendaASerDecorada;
	
	public RendaDecorator(Renda rendaASerDecorada) {
		this.rendaASerDecorada = rendaASerDecorada;
	}

	public double getValorRenda() {
		return rendaASerDecorada.getValorRenda();
	}
	
	public String getDescricao() {
		return rendaASerDecorada.getDescricao();
	}
}