package exercicio6;

import java.util.Calendar;

public class TempoRestante {
	
	public static void main(String[] args) {
		Calendar dataAtual = Calendar.getInstance();
		Calendar dataFutura = Calendar.getInstance(); // considerando 2021 ao invés de 2014
		
		dataFutura.set(2021, 0, 1, 0, 0, 0);

		long diferencaEmSegundos = converterParaSegundos(dataFutura) - converterParaSegundos(dataAtual);
	
		int arrayUnidades[] = converterParaUnidadesDeTempo(diferencaEmSegundos);
		
		imprimeUnidadesConvertidas(arrayUnidades);
	}
	
	public static long converterParaSegundos(Calendar data) {
		return data.get(Calendar.YEAR) * (12*30*86400) + data.get(Calendar.MONTH) * (30*86400) +
				data.get(Calendar.DAY_OF_MONTH) * 86400 + data.get(Calendar.HOUR_OF_DAY) * 3600
				+ data.get(Calendar.MINUTE) * 60 + data.get(Calendar.SECOND);
	}
	
	public static int[] converterParaUnidadesDeTempo(long diferencaEmSegundos) {
		/*
		 * 1 ano = 31104000 segundos
		 * 1 mes = 2952000 segundos
		 * 1 dia = 86400 segundos
		 * 1 minuto = 3600 segundos
		 *  */
		int baseSegundos[] = {31104000, 2592000, 86400, 3600, 60, 1};
		int unidadesConvertidas[] =  new int[6]; // uma posição para cada unidade (ano, mes, dia...)
		int tempoConvertido = 0;
		
		for (int i = 0; i < 6; i++) {
			tempoConvertido = (int)(diferencaEmSegundos / baseSegundos[i]);
			diferencaEmSegundos -= tempoConvertido * baseSegundos[i];
			unidadesConvertidas[i] = tempoConvertido;
		}
		return unidadesConvertidas;
	}
	
	public static void imprimeUnidadesConvertidas(int unidadesConvertidas[]) {
		String nomeUnidades[] = {"Anos", "Meses", "Dias", "Horas", "Minutos", "Segundos"}; 
		for (int i = 0; i < unidadesConvertidas.length; i++) {
			System.out.println(nomeUnidades[i] + ": " + unidadesConvertidas[i]);
		}
	}
}
