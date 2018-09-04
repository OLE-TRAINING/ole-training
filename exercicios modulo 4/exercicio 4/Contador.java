
public class Contador {
   private int valor=0;
   
   //metodos Getters e Setters
   public void setValor(int number) {
	   this.valor=number;
   }
   
   public int getValor(int number) {
	  return this.valor;
   }
   
   //demais metodos
   public void increases() {
	   this.valor++;
   }
   
   public void decrement() {
	   this.valor--;
   }
   
   public void showContador() {
	   System.out.println(this.valor);
   }
}
