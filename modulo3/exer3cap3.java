import java.util.Locale;
import java.util.Scanner;

public class exer3cap3 {

    public static void main (String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho do vetor: ");
        int vectorSize = sc.nextInt();
        double tenNumbers[] = new double [vectorSize];
        fillsVector (tenNumbers, vectorSize);
        System.out.println("A multiplicação dos números digitados é: "+ multiplication (tenNumbers, vectorSize));
    }

    public static void fillsVector (double tenNumbers[], int vectorSize ){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++){
            System.out.print("Digite o número na posição ["+index+"] = ");
            tenNumbers [index] = sc.nextDouble();
}
    }

    public static double multiplication (double tenNumbers[], int vectorSize){
        double result = 1.0;
        for (int index = 0; index < vectorSize; index++){
            result = result * tenNumbers[index];
        }
        return result;
    }
}