import java.util.Calendar;

public class AteDoisMilEVinte {

	public static void main(String[] args) {
		// como 2014 ja passou ano a ser considerado:2020
		Calendar data = Calendar.getInstance();
		System.out.println("Ano : " + data.get(Calendar.YEAR));
		System.out.println("Mês : " + (data.get(Calendar.MONTH) + 1));
		System.out.println("Dia do mês: " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora : " + data.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto : " + data.get(Calendar.MINUTE));
		System.out.println("Segundo : " + data.get(Calendar.SECOND));

		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.YEAR, 2020);
		data1.set(Calendar.MONTH, 1);
		data1.set(Calendar.DAY_OF_MONTH, 1);
		data1.set(Calendar.HOUR_OF_DAY, 0); // am/pm ?
		data1.set(Calendar.MINUTE, 0);
		data1.set(Calendar.SECOND, 0);
        
		long atual = data.getTimeInMillis();
		long futuro = data1.getTimeInMillis();
		
		long tempoQueFalta = (futuro-atual)/1000; //miliss para s
		
		/*
		 * 1 Anos = 31557600 Segundos
		 * 1mes =  2629800 
		 * 1 dia = 86400
		 * 1 h = 3600
		 * 1m = 60 
		 * 
		 * 
		 */
		long anos =  tempoQueFalta/31557600;
		tempoQueFalta = tempoQueFalta-anos*31557600;
		
		long meses = tempoQueFalta/2629800;
		tempoQueFalta = tempoQueFalta-meses*2629800;
		
		long dias = tempoQueFalta/86400;
		tempoQueFalta = tempoQueFalta-dias*86400;
		
		long horas = tempoQueFalta/3600;
		tempoQueFalta = tempoQueFalta-horas*3600;
		
		long minutos = tempoQueFalta/60;
		tempoQueFalta = tempoQueFalta-minutos*60;
		
		long segundos = tempoQueFalta;
				
		System.out.println("\nFalta exatamente:\n" + anos + " Anos,\n" + meses + " meses,\n" + dias + " dias,\n" + horas
				+ " horas,\n" + minutos + " minutos,\n" + segundos + " segundos\npara chegar em 2020");

	}

}
