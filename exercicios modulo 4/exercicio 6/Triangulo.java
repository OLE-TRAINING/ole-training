public class Triangulo {
	private PontoCartesiano dotOne;
	private PontoCartesiano dotTwo;
	private PontoCartesiano dotThree;

	public Triangulo() {

	}

	public Triangulo(PontoCartesiano xOne, PontoCartesiano xTwo, PontoCartesiano xThree) {
             if(isTriangle(xOne,xTwo,xThree)) {
            	 this.dotOne=xOne;
            	 this.dotTwo=xTwo;
            	 this.dotThree=xThree;
            	 System.out.println("triangle made successfully!!");
             }else {
            	 System.out.println("This is not a triangle!!");
             }
	}
    
	
	//metodos getters e setters
	public PontoCartesiano getDotOne() {
		return this.dotOne;
	}
	
	public PontoCartesiano getDotTwo() {
		return this.dotTwo;
	}
	
	public PontoCartesiano getDotThree() {
		return this.dotThree;
	}
	
	
	public boolean isTriangle(PontoCartesiano x, PontoCartesiano y, PontoCartesiano z) {
		
		float matriz[][] = new float[3][3];

		matriz[0][0] = x.getX();
		matriz[0][1] = x.getY();
		matriz[0][2] = 1;

		matriz[1][0] = y.getX();
		matriz[1][1] = y.getY();
		matriz[1][2] = 1;

		matriz[2][0] = z.getX();
		matriz[2][1] = z.getY();
		matriz[2][2] = 1;

		// mdv = main diagonal value
		float mdvOne = matriz[0][0] * matriz[1][1] * matriz[2][2];
		float mdvTwo = matriz[0][1] * matriz[1][2] * matriz[2][0];
		float mdvThree = matriz[0][2] * matriz[1][0] * matriz[2][1];

		// sdv = secondary diagonal value
		float sdvOne = matriz[0][2] * matriz[1][1] * matriz[2][0];
		float sdvTwo = matriz[0][0] * matriz[1][2] * matriz[2][1];
		float sdvThree = matriz[0][1] * matriz[1][0] * matriz[2][2];

		float sum = (mdvOne + mdvTwo + mdvThree) - (sdvOne + sdvTwo + sdvThree);

		if (sum == 0) {
			return false;
		}

		return true;
	}

}
