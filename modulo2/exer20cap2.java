
import java.util.Scanner;

public class exer20cap2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with dimension of triangle: \n");
        int dimensionTriangle = sc.nextInt();
        fillsTriangle1(dimensionTriangle);
        fillsTriangle2(dimensionTriangle);
        fillsTriangle3(dimensionTriangle);
        fillsTriangle4(dimensionTriangle);
    }

    public static void fillsTriangle1 (int dimensionTriangle) {
        System.out.println("");
        for (int line = 1; line <= dimensionTriangle; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void fillsTriangle2 (int dimensionTriangle) {
        System.out.println("");
        for (int line = 1; line <= dimensionTriangle; line++) {
            for (int column = line; column <= dimensionTriangle; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void fillsTriangle3 (int dimensionTriangle) {
        System.out.println("");
        for (int line = 1; line <= dimensionTriangle; line++) {
            for (int column = 1; column <= dimensionTriangle; column++) {
                if (column>=line){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void fillsTriangle4 (int dimensionTriangle) {
        System.out.println("");
        for (int line = 1; line <= dimensionTriangle; line++) {
            for (int column = 1; column <= dimensionTriangle; column++) {
                if (column<=dimensionTriangle-line){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}










