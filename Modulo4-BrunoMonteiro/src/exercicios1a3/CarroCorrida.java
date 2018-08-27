package exercicios1a3;

public class CarroCorrida {

	private Integer numeroIdentificacao;
	private Double velocidadeAtual = 0.0;
	private Double velocidadeMaxima = 100.0;
	private Piloto piloto;
	private Motor motor;

	public CarroCorrida() {}

	/* Exercício 1 */
	public CarroCorrida(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	/* Exercício 3 */
	public void acelerar() {
		velocidadeAtual += 10;

		if (velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
		
		motor.setPotencia(motor.getPotencia() + (int)(0.1 * motor.getPotencia()));
		
		if (motor.getPotencia() > 100) {
			motor.setPotencia(100);
		}
	}

	public Integer getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(Integer numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public Double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(Double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public Double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
