import java.util.Scanner;

public class exer5cap3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho do primeiro vetor: ");
        int vectorOneSize = sc.nextInt();
        int vectorOne[] = new int[vectorOneSize];
        System.out.println("Entre com o tamanho do segundo vetor: ");
        int vectorTwoSize = sc.nextInt();

        int vectorTwo[] = new int[vectorTwoSize];
        System.out.println("Preencha o primeiro vetor: ");
        fillsVector(vectorOne, vectorOneSize);
        System.out.println("Preencha o segundo vetor: ");
        fillsVector(vectorTwo, vectorTwoSize);

        if (compareVectors(vectorOne, vectorTwo)){
            System.out.println("\nOs vetores são iguais.");
        } else {
            System.out.println("\nOs vetores são diferentes.");
        }
    }

    public static void fillsVector(int vector[], int vectorSize) {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++) {
            System.out.print("Digite o número na posição [" + index + "] = ");
            vector[index] = sc.nextInt();
        }
    }

    public static boolean compareVectors(int vectorOne[], int vectorTwo[]) {
        boolean answer = false;
        if (vectorOne.length != vectorTwo.length) {
            return answer;
        }
        for (int index = 0; index < vectorOne.length; index++) {
            if (vectorOne[index] == vectorTwo[index]) {
                answer = true;
            }
        }
        return answer;
    }
}