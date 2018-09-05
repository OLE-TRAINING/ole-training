public class Execute {
	public static void main(String[] args) {
		Cachorro viralata = new Cachorro();
		Cavalo cavalao = new Cavalo();
		Preguiça preguica = new Preguiça();

		viralata.setSom("Au AU AU AU UUUUUUu");
		cavalao.setSom("hihiiiihHIHIHhIHihIHHIHIHihihih");
		preguica.setSom("?????????");

		// fiz o exercicio de duas formas diferentes se uma delas nao for polimorfica me
		// chama
		emitirSom(viralata);
		emitirSom(cavalao);
		emitirSom(preguica);

		viralata.fazerBarulho();
		cavalao.fazerBarulho();
		preguica.fazerBarulho();
	}

	static void emitirSom(Animal animal) {
		System.out.println(animal.getSom());
	}
}
