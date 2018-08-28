import java.util.Arrays;
import java.util.Scanner;

public class exer11cap3 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int vectorSize = sc.nextInt();
        int vector[] = new int[vectorSize];
        System.out.println("Preencha o vetor:");
        fillsVector(vector, vectorSize);
        numberOccurrences(vector, vectorSize);

    }

    public static void fillsVector(int vector[], int vectorSize) {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++) {
            System.out.print("Digite o número na posição [" + index + "] = ");
            vector[index] = sc.nextInt();
        }
    }

    public static void numberOccurrences(int vector[], int vectorSize) {
        int contador = 0;
        for (int index = 0; index < vectorSize; index++) {
            contador = 0;
                for(int index2 = 0; index2<vectorSize; index2++){
                    if(vector[index] == vector[index2]){
                        contador++;
                    }
                }
                System.out.println("O número "+vector[index]+" da posição ["+index+"] repete "+contador+ " vezes.");
        }
    }
}