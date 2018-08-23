import java.util.Scanner;
public class execute {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de dias trabalhados e o salario:");
        int n= s.nextInt();
        float sa = s.nextFloat();
        
        System.out.println("Salario Proporcional:"+(((float)n/22)*sa));
	}

}
