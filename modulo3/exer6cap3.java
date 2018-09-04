import java.util.Scanner;

public class exer6cap3 {

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho dos vetores: ");
        int vectorSize = sc.nextInt();
        int vectorOne[] = new int[vectorSize];
        int vectorTwo[] = new int[vectorSize];

        System.out.println("Preencha o primeiro vetor: ");
        fillsVector(vectorOne, vectorSize);
        System.out.println("Preencha o segundo vetor: ");
        fillsVector(vectorTwo, vectorSize);
        System.out.println("O produto escalar dos dois vetores é: "+ escalarVector(vectorOne,vectorTwo,vectorSize));

    }

    public static void fillsVector(int vector[], int vectorSize) {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++) {
            System.out.print("Digite o número na posição [" + index + "] = ");
            vector[index] = sc.nextInt();
        }
    }

    public static int escalarVector(int vectorOne[], int vectorTwo[], int vectorSize) {
        int sum = 0;
        int vectorOperations[] =  new int [vectorSize];
        for (int index = 0; index < vectorOne.length; index++) {
            vectorOperations [index] = vectorOne[index] * vectorTwo [index];
            sum += vectorOperations [index];
        }
        return  sum;
    }
}