import java.util.Calendar;

public class VerificaDatas {
	
	
	public void verificaDatas(Calendar data1, Calendar data2) {
		long d1 = data1.getTimeInMillis();
		long d2 = data2.getTimeInMillis();
		long diferen�a;
		if(d1==d2) {
			System.out.println("As datas s�o iguais!!");
			diferen�a=0;
		}else if(d1>d2) {
			mostrarData(data1);
			diferen�a=d1-d2;
		} else {
			mostrarData(data2);
			diferen�a=d2-d1;
		}
		
		
		//1 dia = 86400000 milisegundos
		if(((double)diferen�a/86400000)>20.0) {
			System.out.println("A diferen�a � acima de 20 dias");
		}
		
	}
	
	public void mostrarData(Calendar data) {
		System.out.println("Maior data:");
		System.out.println("Ano : " + data.get(Calendar.YEAR));
		System.out.println("M�s : " + data.get(Calendar.MONTH));
		System.out.println("Dia do m�s: " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora : " + data.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto : " + data.get(Calendar.MINUTE));
		System.out.println("Segundo : " + data.get(Calendar.SECOND));
	}
}