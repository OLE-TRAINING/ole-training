package exercicio17;

import java.util.Scanner;

public class Trapezio {
	
	public static double calcularAreaTrapezio(double h, double b, double B) {
		
		double area = (h*(b+B))/2;
		
		return area;
	}
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		double altura = 0;
		double baseMenor = 0;
		double baseMaior = 0;
		
		System.out.print("Altura: ");
		altura = s.nextDouble();
		
		System.out.print("Base menor: ");
		baseMenor = s.nextDouble();
		
		System.out.print("Base maior: ");
		baseMaior = s.nextDouble();
		
		double area = calcularAreaTrapezio(altura, baseMenor, baseMaior);
		System.out.println("Área do trapézio: " + area);
		
		s.close();
	}

}
