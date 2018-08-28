import java.util.Scanner;

public class exer9cap2 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int numero = 11111;
        do {
            System.out.println("Digite um número para ser invertido:");
            numero = sc.nextInt();
            if(numero <10000 && numero > 0){
                int i = 0;
                while (numero > 0) {
                    i *= 10;
                    i += (numero % 10);
                    numero /= 10;
                }
                if(i<1000){
                    System.out.print("O número invertido é: 0");
                    System.out.printf("%d.\n", i);
                } else {
                    System.out.printf("O número invertido é: %d.\n", i);
                }
                break;
            } else {
                System.out.println("Entre com um número de 4 dígitos");
            }
        } while (numero <10000==false);
    }
}