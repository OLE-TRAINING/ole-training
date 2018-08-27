import java.util.Scanner;

public class exer2cap3 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho do vetor: ");
        int vectorSize = sc.nextInt();
        int tenNumbers [] = new int [vectorSize];
        int sum = 0;

        fillsVector (tenNumbers, vectorSize);
        printVector (tenNumbers, vectorSize);
        System.out.println("A média dos números digitados é: "+average (tenNumbers, sum, vectorSize));
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

    public static double average (int tenNumbers[], int sum, int vectorSize ){
        for (int index = 0; index < vectorSize; index++){
            sum += tenNumbers[index];
        }
        double average = sum / vectorSize;
        return average;
    }
}