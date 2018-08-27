import java.util.Scanner;

public class exer4cap3 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho do vetor: ");
        int vectorSize = sc.nextInt();
        int vector[] = new int [vectorSize];
        int position = vector.length-1;
        int posAtual = 0;
        fillsVector (vector, vectorSize);
        inverter (vector, posAtual, position);
        printVector (vector, vectorSize );
    }

    public static void fillsVector (int vector[], int vectorSize ){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++){
            System.out.print("Digite o número na posição ["+index+"] = ");
            vector [index] = sc.nextInt();
        }
    }

    public static void printVector (int vector[], int vectorSize ){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++){
            System.out.println("Posição ["+index+"] = "+vector[index]);
        }
    }

    public static int[] inverter (int vector[], int posAtual, int position){
        int save = 0;
        if (posAtual>=position){
            return vector;
        } else {
            save = vector[posAtual];
            vector[posAtual] = vector[position];
            vector[position] = save;
            return inverter(vector, posAtual+1, position-1);
        }
    }
}