package ExerciciosChapter4;

public class Exer3cap4 {

    public static void main (String args[]){
        CarroCorrida car = new CarroCorrida(100.0);
        car.setVelocidadeAtual(0);
        car.setNumeroIdentificacao(1234);
        car.setMotor(new Motor(100));
        car.setPiloto(new Piloto());
        car.getPiloto().setNome("Tiago");
        car.getPiloto().setHabilidade(75);
        car.getPiloto().setIdade(28);
        System.out.println(car.getVelocidadeAtual());
    }
}