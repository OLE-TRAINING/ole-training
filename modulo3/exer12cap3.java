import java.util.Scanner;

public class exer12cap3 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz quadrada: ");
        int matrixSize = sc.nextInt();
        int matrix[][] = new int [matrixSize][matrixSize];
        System.out.println("Preencha os valores da matriz "+matrixSize+" x "+matrixSize+": ");
        fillsMatrix(matrix,matrixSize,matrixSize);
        System.out.println("\nOriginal");
        printMatrix(matrix,matrixSize,matrixSize);
        System.out.println("\nTransposta");
        printMatrix(matrixTransposition(matrix,matrixSize,matrixSize),matrixSize,matrixSize);
    }

    public static void fillsMatrix (int matrix[][],int lineSize,int columnSize) {
        Scanner sc = new Scanner(System.in);
        for (int line = 0; line < lineSize; line++) {
            for (int column = 0; column < columnSize; column++){
                System.out.print("Digite o número na posição [" +line+ "] ["+column+"] = ");
                matrix[line][column] = sc.nextInt();
            }
        }
    }

    public static int [][] matrixTransposition (int matrix[][],int lineSize,int columnSize) {
        int matrix2 [][] = new int [lineSize][columnSize];
        for (int line = 0; line < lineSize; line++) {
            for (int column = 0; column < columnSize; column++){
                matrix2[column][line]=matrix[line][column];
            }
        }

        return matrix2;
    }

    public static void printMatrix (int matrix[][],int lineSize,int columnSize){
        Scanner sc = new Scanner(System.in);
        for (int line = 0; line < lineSize; line++) {
            for (int column = 0; column < columnSize; column++){
                System.out.print("  "+matrix[line][column]+" [" +line+ "]["+column+"]");
            }
            System.out.println("");
        }
    }
}