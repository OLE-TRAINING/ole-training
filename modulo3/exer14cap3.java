import java.util.Scanner;

public class exer14cap3 {

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o tamanho do vetor: ");
        int vectorSize = sc.nextInt();
        int tenNumbers[] = new int[vectorSize];
        fillsVector(tenNumbers, vectorSize);
        printVector(tenNumbers, vectorSize);

        if (ehProgressao(tenNumbers, vectorSize)){
            System.out.println("\nÉ progressão!");
        } else {
            System.out.println("\nNão é progressão!");
        }

    }

    public static boolean ehProgressao (int vector[], int vectorSize){
        Scanner sc = new Scanner(System.in);
        for (int index = vectorSize; index < 0; index++) {
            int constante = vector[0] - (vector[1]);
            if(vector[index]-constante == vector[index+1]){
                return true;
            }
        }
        return false;
    }

    public static void fillsVector(int tenNumbers[], int vectorSize) {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++) {
            System.out.print("Digite o número na posição [" + index + "] = ");
            tenNumbers[index] = sc.nextInt();
        }
    }

    public static void printVector(int tenNumbers[], int vectorSize) {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++) {
            System.out.println("Posição [" + index + "] = " + tenNumbers[index]);
        }
    }
}