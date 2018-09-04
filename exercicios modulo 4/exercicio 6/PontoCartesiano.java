
public class PontoCartesiano {
    private float x=0;
    private float y=0;
    
    public PontoCartesiano() {
    	
    }
    
    public PontoCartesiano(float Xx, float Yy) {
    	this.x=Xx;
    	this.y=Yy;
    }
    
    //metodos getters e setters
    public float getX() {
    	return this.x;
    }
    
    public float getY() {
    	return this.y;
    }
    
    public void setX(float Xx) {
    	this.x=Xx;
    }
    
    public void setY(float Yy) {
    	this.y=Yy;
    }
    
    public void show() {
    	System.out.println("(X="+x+",Y="+y+")");
    }
}
