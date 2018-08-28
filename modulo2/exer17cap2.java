import java.util.Locale;
import java.util.Scanner;

public class exer17cap2 {

    public static void main (String args []){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a altura do trapézio:");
        double altura = sc.nextDouble();
        System.out.println("Entre com a base menor do trapézio:");
        double baseMenor = sc.nextDouble();
        System.out.println("Entre com a base maior do trapézio:");
        double baseMaior = sc.nextDouble();
        double area = (altura*(baseMenor+baseMaior))/2;
        System.out.println("A área é: "+ area);
    }
}