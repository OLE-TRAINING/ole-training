package exercicios7e8;

import java.util.Calendar;

public class MaiorData {
	
	public static void main(String[] args) {
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();
		
		data2.set(2019, 7, 20, 0, 0, 0);
		
		imprimeMaiorData(data1, data2);
		possuemMaisDeVinteDiasDiferenca(data1, data2);
	}
	
	public static void imprimeMaiorData(Calendar data1, Calendar data2) {
		if (data1.after(data2)) {
			System.out.println("Maior data: " + data1.getTime());
		} else if(data2.after(data1)) {
			System.out.println("Maior data: " + data2.getTime());
		} else {
			System.out.println("Datas iguais!");
		}
	}
	
	public static void possuemMaisDeVinteDiasDiferenca(Calendar data1, Calendar data2) {
		long d1 = data1.getTimeInMillis();
		long d2 = data2.getTimeInMillis();
		
		// 1 dia = 86400000 milissegundos
		if ((int)((d2 - d1) / (86400000)) > 20 || (int)((d2 - d1) / (86400000)) < -20) {
			System.out.println("As duas datas possuem mais de 20 dias de diferença!");
		} else {
			System.out.println("Não possuem mais de 20 dias de diferença.");
		}
	}
}



