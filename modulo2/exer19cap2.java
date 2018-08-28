public class exer19cap2 {

    public static void main (String args[]){
        int numero = 15;
        while(numero <= 35){
            if(numero%2==1){
                int quadrado = numero*numero;
                System.out.println(numero+" ao quadrado é "+quadrado);
            }
            numero++;
        }
    }
}