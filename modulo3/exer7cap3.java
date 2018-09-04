import java.util.Scanner;
import java.util.Arrays;

public class exer7cap3 {

    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho do vetor: ");
        int vectorSize = sc.nextInt();
        int vector[] = new int[vectorSize];
        fillsVector(vector, vectorSize);
        Arrays.sort(vector);
        printVector(vector, vectorSize);
    }

    public static void fillsVector(int vector[], int vectorSize) {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++) {
            System.out.print("Digite o número na posição [" + index + "] = ");
            vector[index] = sc.nextInt();
        }
    }

    public static void printVector (int vector[], int vectorSize ){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++){
            System.out.println("Posição ["+index+"] = "+vector[index]);
        }
    }
}