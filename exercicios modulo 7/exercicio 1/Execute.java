public class Execute {
	public static void main(String[] args) {
		Cachorro viralata = new Cachorro();
		viralata.setIdade(12);
		viralata.setNome("Bili");
		viralata.setSom("LATINDO PRA CARALHO!!!");
		viralata.setCorrer(true);

		System.out.println(viralata.toString());
	}
}
