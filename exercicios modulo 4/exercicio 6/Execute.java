public class Execute {

	public static void main(String[] args) {
		PontoCartesiano pontoX = new PontoCartesiano(2,5);
		pontoX.show();
		PontoCartesiano pontoY = new PontoCartesiano(3,7);
		pontoY.show();
		PontoCartesiano pontoZ = new PontoCartesiano(5,11);
		pontoZ.show();
		
		System.out.println();
		PontoCartesiano pontoX2 = new PontoCartesiano(2,2);
		pontoX2.show();
		PontoCartesiano pontoY2 = new PontoCartesiano(-3,-1);
		pontoY2.show();
		PontoCartesiano pontoZ2 = new PontoCartesiano(-3,1);
		pontoZ2.show();
		
		Triangulo triangleOne=new Triangulo(pontoX,pontoY,pontoZ);
		Triangulo triangleTwo=new Triangulo(pontoX2,pontoY2,pontoZ2);
	}

}
