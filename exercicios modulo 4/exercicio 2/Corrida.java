public class Corrida {
	public static void main(String[] args) {
		// Criacao dos carros que irao correr
		CarroCorrida carroEquipeVelocidade = new CarroCorrida(1, 100.0);
		CarroCorrida carroEquipeTrapaceiros = new CarroCorrida(2, 100.0);

		// Criacao dos pilotos de cada equipe
		Piloto pilotoEquipeVelocidade = new Piloto();
		Piloto pilotoEquipeTrapaceiros = new Piloto();

		// Atributos do piloto da equipe Velocidade
		pilotoEquipeVelocidade.setNome("Piloto 1");
		pilotoEquipeVelocidade.setIdade(25);
		pilotoEquipeVelocidade.setHabilidade(75);

		// Atributos do piloto da equipe Trapaceiros
		pilotoEquipeTrapaceiros.setNome("Piloto 2");
		pilotoEquipeTrapaceiros.setIdade(27);
		pilotoEquipeTrapaceiros.setHabilidade(65);

		// Os pilotos sao colocados nos seus carros
		carroEquipeVelocidade.setPiloto(pilotoEquipeVelocidade);
		carroEquipeTrapaceiros.setPiloto(pilotoEquipeTrapaceiros);

		// Identificao dos carros
		carroEquipeVelocidade.setNumeroIdentificacao(1);
		carroEquipeTrapaceiros.setNumeroIdentificacao(2);

		// Carros sao ligados
		carroEquipeVelocidade.ligar();
		carroEquipeTrapaceiros.ligar();

		// Inicia a corrida
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
		
		//testes
		Motor motor=new Motor(-97);
		Motor motor1=new Motor(-98);
		Motor motor2=new Motor(-99);
		Motor motor3=new Motor(-100);
		Motor motor4=new Motor(-101);
		Motor motor5=new Motor(0);
		Motor motor6=new Motor(1);
		Motor motor7=new Motor(2);
		Motor motor8=new Motor(100);
		Motor motor9=new Motor(101);
		Motor motor10=new Motor(102);
		
		System.out.println("Motor ="+motor.getPotencia());
		System.out.println("Motor1="+motor1.getPotencia());
		System.out.println("Motor2="+motor2.getPotencia());
		System.out.println("Motor3="+motor3.getPotencia());
		System.out.println("Motor4="+motor4.getPotencia());
		System.out.println("Motor5="+motor5.getPotencia());
		System.out.println("Motor6="+motor6.getPotencia());
		System.out.println("Motor7="+motor7.getPotencia());
		System.out.println("Motor8="+motor8.getPotencia());
		System.out.println("Motor9="+motor9.getPotencia());
		System.out.println("Motor10="+motor10.getPotencia());
		
	}
}