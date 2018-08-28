import java.util.Calendar;

public class VerificaDatas {
	
	
	public void verificaDatas(Calendar data1, Calendar data2) {
		long d1 = data1.getTimeInMillis();
		long d2 = data2.getTimeInMillis();
		if(d1==d2) {
			System.out.println("As datas são iguais!!");
		}else if(d1>d2) {
			mostrarData(data1);
		} else {
			mostrarData(data2);
		}
	}
	
	public void mostrarData(Calendar data) {
		System.out.println("Maior data:");
		System.out.println("Ano : " + data.get(Calendar.YEAR));
		System.out.println("Mês : " + data.get(Calendar.MONTH));
		System.out.println("Dia do mês: " + data.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora : " + data.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto : " + data.get(Calendar.MINUTE));
		System.out.println("Segundo : " + data.get(Calendar.SECOND));
	}
}
