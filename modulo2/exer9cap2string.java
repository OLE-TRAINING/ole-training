import java.util.Scanner;

public class exer9cap2string {

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um número para ser invertido:");
            numero = sc.nextInt();
            if(numero<10000){
                StringBuffer sb = new StringBuffer(Integer.toString(numero));
                sb.reverse();
                System.out.println("O número invertido é: "+sb);
            } else {
                System.out.println("Entre com um número de 4 dígitos");
            }
        } while((numero <10000)==false);
    }
}