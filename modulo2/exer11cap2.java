import java.util.Scanner;
import java.util.Locale;

public class exer11cap2 {

    public static void main (String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias trabalhados:");
        int dias = sc.nextInt();
        System.out.print("Digite o valor do salário \nR$: ");
        double salario = sc.nextDouble();
        double vaiReceber = (dias*100/22)*(salario/100);
        System.out.printf("Vai receber R$ %.2f",vaiReceber);
    }
}
