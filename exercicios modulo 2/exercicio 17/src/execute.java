import java.util.Scanner;
public class execute {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        System.out.println("Vamos calcular a Area de um Trapezio:\nDigite a altura(h) do trapezio:");
        int h = s.nextInt();
        System.out.println("Digite base menor do trapezio:");
        int b = s.nextInt();
        System.out.println("Digite a base maior do trapezio:");
        int B = s.nextInt();
        
        System.out.println("Area="+(h*(b+B))/2);
	}

}
