
public class Motor {
	private int potencia = 0;

	public Motor() {

	}

	public Motor(int potenciaConstructor) {
		potencia = putsBetweenOneAndHundred(potenciaConstructor);
	}

	// metodos Getters e Setters
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int number) {
		potencia = putsBetweenOneAndHundred(number);
	}

	private int putsBetweenOneAndHundred(int number) {
		if (number >= 1 && number <= 100) {
			return number;
		} else {

			if (number > 100 && number % 100 != 0) {
				return number % 100;
			} else if (number < 1 && (number - 1) % 100 != 0) {
				number = 1 - number;
				return number % 100;
			} else {
				return 100;
			}
		}
	}

}
