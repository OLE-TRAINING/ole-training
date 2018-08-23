package exercicio5;

import java.util.Scanner;

public class MesCorrespondente {

	public static String calcularMes(int numeroCorrespondenteAoMes) {
		
		String mesCorrespondente = "Mês Inválido!";
		
		switch(numeroCorrespondenteAoMes) {
			
			case 1: mesCorrespondente = "Janeiro";
					break;
					
			case 2: mesCorrespondente = "Fevereiro";
					break;
					
			case 3: mesCorrespondente = "Março";
					break;
					
			case 4: mesCorrespondente = "Abril";
					break;
					
			case 5: mesCorrespondente = "Maio";
					break;
					
			case 6: mesCorrespondente = "Junho";
					break;
					
			case 7: mesCorrespondente = "Julho";
					break;
					
			case 8: mesCorrespondente = "Agosto";
					break;
					
			case 9: mesCorrespondente = "Setembro";
					break;
					
			case 10: mesCorrespondente = "Outubro";
					break;
					
			case 11: mesCorrespondente = "Novembro";
					break;
					
			case 12: mesCorrespondente = "Dezembro";
					break;
		}
		
		return mesCorrespondente;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 	

		int numeroCorrespondenteAoMes  = 0;
		
		while(true) {
			System.out.print("Digite o numero correspondente ao mês: ");
			numeroCorrespondenteAoMes = s.nextInt();
			
			if(numeroCorrespondenteAoMes == 0)
				break;
			
			System.out.println(calcularMes(numeroCorrespondenteAoMes));
		}
		
		s.close();

	}

}
