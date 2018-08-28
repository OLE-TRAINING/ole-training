package exercicios5e6;

public class Triangulo {

	PontoPlanoCartesiano verticeA = new PontoPlanoCartesiano(0, 0);
	PontoPlanoCartesiano verticeB = new PontoPlanoCartesiano(10, 20);
	PontoPlanoCartesiano verticeC = new PontoPlanoCartesiano(15, 46);
	
	public Triangulo(PontoPlanoCartesiano verticeA, PontoPlanoCartesiano verticeB, PontoPlanoCartesiano verticeC) {
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
	}
}
