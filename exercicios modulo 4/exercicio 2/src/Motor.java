
public class Motor {
    private int potencia;
    
    public Motor(int potenciaConstructor) {
    	
    	if(potenciaConstructor>=1 && potenciaConstructor<=100) {
    		this.potencia=potenciaConstructor;
    	}else {
                
              if(potenciaConstructor>100 && potenciaConstructor%100!=0) {
            	  potencia=potenciaConstructor%100;
              }else if(potenciaConstructor<1 && (potenciaConstructor-1)%100!=0) {
            	  potenciaConstructor=1-potenciaConstructor;
            	  potencia=potenciaConstructor%100;
              } else {
            	  potencia =100;
              }
    	}
    }
    
    //metodos Getters e Setters
    public int getPotencia() {
    	return potencia;
    }
}
