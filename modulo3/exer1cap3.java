import java.util.Scanner;

public class exer1cap3 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o tamanho do vetor: ");
        int vectorSize = sc.nextInt();
        int tenNumbers [] = new int [vectorSize];
        fillsVector (tenNumbers, vectorSize);
        printVector (tenNumbers, vectorSize);

    }

    public static void fillsVector (int tenNumbers[], int vectorSize ){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++){
            System.out.print("Digite o número na posição ["+index+"] = ");
            tenNumbers [index] = sc.nextInt();
        }
    }

    public static void printVector (int tenNumbers[], int vectorSize ){
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++){
            System.out.println("Posição ["+index+"] = "+tenNumbers[index]);

        }
    }


}
