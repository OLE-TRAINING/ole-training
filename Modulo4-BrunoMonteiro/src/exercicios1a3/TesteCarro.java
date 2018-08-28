package exercicios1a3;

public class TesteCarro {

	public static void main(String[] args) {

		int potencia = 82;
		Motor m = new Motor(potencia);
		
		CarroCorrida carro = new CarroCorrida();
		carro.setMotor(m);
		
		carro.acelerar();
		System.out.println(carro.getVelocidadeAtual());
		System.out.println(carro.getMotor().getPotencia());
	}

}
