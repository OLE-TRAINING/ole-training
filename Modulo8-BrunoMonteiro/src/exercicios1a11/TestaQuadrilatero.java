package exercicios1a11;

import javax.swing.JOptionPane;

public class TestaQuadrilatero {

	public static void main(String[] args) {
		
		//exercicio pede 2 parâmetros, vou utilizar apenas um pois é um quadrado (4 lados iguais)

		int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado: "));
		
		try {
			Quadrado quadrado = new Quadrado(lado);
			System.out.println("Area: " + quadrado.calcularArea());
			System.out.println("Perimetro: " + quadrado.calcularPerimetro());
		} catch(IllegalArgumentException e) {
			//e.printStackTrace(); // Exercicio 10
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
