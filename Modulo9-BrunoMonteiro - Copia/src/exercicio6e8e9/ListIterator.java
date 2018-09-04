package exercicio6e8e9;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import exercicio5e7.ListSetForeach;

public class ListIterator {

	public static void main(String[] args) {
		List<Integer> listaNum = new Vector<Integer>();
		ListSetForeach.insereNumerosCollection(listaNum);
		percorrerListIteratorImprimirMedia(listaNum);
	}
	
	public static void percorrerListIteratorImprimirMedia(List<Integer> lista) {
		Iterator<Integer> iterador = lista.iterator();
		
		double media = 0;
		while (iterador.hasNext()) {
			media += iterador.next();
		}
		System.out.println("Media: " + (media / 8.0));
	}
	
	// Exerc�cio 8: Cole��es do tipo 'Set' n�o aceitam duplicatas.
	
	// Exerc�cio 9: Possuiria 6 elementos (apenas n�o inserir 100 e 200).
}