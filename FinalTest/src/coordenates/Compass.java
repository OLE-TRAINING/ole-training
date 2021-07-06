package coordenates;

public enum Compass {

	N(1), W(2), S(3), E(4);
	
	private int valor;
	
	Compass(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public static String getUpdatedCorrespondentCompass(int cardinalCompassPoint) {
		for (Compass compass : Compass.values()) {
			if (compass.getValor() == cardinalCompassPoint) {
				return compass.toString();
			}
		}
		return null;
	}
}
