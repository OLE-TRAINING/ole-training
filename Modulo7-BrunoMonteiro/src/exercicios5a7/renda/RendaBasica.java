package exercicios5a7.renda;

public class RendaBasica implements Renda {

	private double renda = 1000;
	
	@Override
	public double getValorRenda() {
		return renda;
	}

	@Override
	public String getDescricao() {
		return "Renda básica de todo funcionário";
	}
}
