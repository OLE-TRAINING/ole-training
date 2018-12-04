import java.util.Scanner;

public class exer10cap2 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é número primo:");
        int primo = sc.nextInt();
        boolean ehPrimo = true;
        for (int i = 2; i <= primo; i++) {
            if ( ( (primo % i) == 0) && (i != primo) ) {
                ehPrimo = false;
            }
        }
        if (ehPrimo) {
            System.out.println( "é Primo" );
        } else {
            System.out.print( "Não é Primo");
        }


    }
}
