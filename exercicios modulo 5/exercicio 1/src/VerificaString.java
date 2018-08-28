
public class VerificaString {
     private String string;
     
	
     
     //metodos getters e setters
     public String getString() {
    	 return string;
     }
     
     public void setString(String string) {
    	 this.string = string;
     }
     
     
     public void checkString(String str) {
    	 if(str.length()<8) {
    		System.out.println("Erro: string com menos de 8 caracteres!!!");
    	 }
     }
}
