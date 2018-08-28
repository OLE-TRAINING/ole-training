package exercicios1a3;

/* Exercício 2 */
public class Motor {

	private Integer potencia;

	public Motor(Integer potencia) {
		setPotencia(potencia);
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		if (potencia < 1) {
			this.potencia = 1;
		} else if (potencia > 100) {
			this.potencia = 100;
		} else {
			this.potencia = potencia;
		}
	}
}
