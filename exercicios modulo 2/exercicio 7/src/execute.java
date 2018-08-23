public class execute {

	public static void main(String[] args) {
		int inp=0;
		float par=1;
		// numeros 1 e 30 nao considerados
		for(int x=2;x<30;x++){
			if(x%2!=0){
			inp+=x;	
			}else {
				par*=x;
			}
		}
			System.out.println("Soma dos Impares:"+inp+"\nMultiplicaçao dos pares:"+par); 
	}
}
