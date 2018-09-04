
public class CarroCorrida {
	// Estados
	private Integer numeroIdentificacao;
	private Double velocidadeAtual = 0.0;
	private Double velocidadeMaxima = 100.0;
	private Piloto piloto;

	// resposta exercicio1
	public CarroCorrida(Double velocidadeMaximaConstructor) {
		this.velocidadeMaxima = velocidadeMaximaConstructor;
	}

	// Contrutor modificado
	public CarroCorrida(Integer numeroIdentificacao, Double velocidadeMaxima) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	// Comportamentos
	void ligar() {
		System.out.println("VRUUUMmmmmmmmmm");
	}

	void desligar() {
		System.out.println("MMMmmmm......");
	}

	void acelerar() {
		velocidadeAtual += 10;
		if (velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
	}

	void frear(Integer intensidadeFreada) {
		if (intensidadeFreada > 100) {
			intensidadeFreada = 100;
		} else if (intensidadeFreada < 0) {
			intensidadeFreada = 0;
		}
		velocidadeAtual -= intensidadeFreada * 0.25;
		if (velocidadeAtual < 0) {
			velocidadeAtual = 0.0;
		}
	}

	// metodos Getters e Setters
	public Integer getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(Integer numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Double getVelocidadeAtual() {
		return velocidadeAtual;
	}
}
