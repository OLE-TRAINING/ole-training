import java.util.Scanner;
import java.util.Arrays;

public class exer10cap3 {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor maior: ");
        int vectorSizeMax = sc.nextInt();
        int vectorMax[] = new int[vectorSizeMax];
        System.out.println("Digite o tamanho do vetor menor: ");
        int vectorSizeMin = sc.nextInt();
        int vectorMin[] = new int[vectorSizeMin];
        System.out.println("Preencha o vetor maior:");
        fillsVector(vectorMax, vectorSizeMax);
        System.out.println("Preencha o vetor menor:");
        fillsVector(vectorMin, vectorSizeMin);

        if (contain(vectorMax, vectorMin, vectorSizeMin)){
            System.out.println("\nO vetor menor está contido no maior.");
        } else {
            System.out.println("\nO vetor menor não está contido no maior.");
        }
    }

    public static void fillsVector(int vector[], int vectorSize) {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < vectorSize; index++) {
            System.out.print("Digite o número na posição [" + index + "] = ");
            vector[index] = sc.nextInt();
        }
    }

    public static boolean contain(int vectorMax[], int vectorMin[], int vectorSizeMin) {
        int contador = 0;
        for (int index = 0; index < vectorSizeMin; index++) {
            if(Arrays.binarySearch(vectorMax,vectorMin[index])>=0){
                contador++;
                if(contador == vectorSizeMin){
                    return true;
                }
            }
        }
        return false;
    }
}