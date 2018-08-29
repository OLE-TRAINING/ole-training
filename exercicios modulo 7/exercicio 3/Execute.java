
public class Execute {

	public static void main(String[] args) {
		Cachorro viralata = new Cachorro();
	    Cavalo cavalao = new Cavalo();
	    Preguiça preguica = new Preguiça();
		Veterinario veterinario = new Veterinario();
		
		viralata.setSom("Au AU AU AU UUUUUUu");
		cavalao.setSom("hihiiiihHIHIHhIHihIHHIHIHihihih");
		preguica.setSom("?????????");
		
		
		veterinario.examinar(viralata);
		veterinario.examinar(cavalao);
		veterinario.examinar(preguica);
		
		
		
	}
	
	static void emitirSom(Animal aa) {
		System.out.println(aa.getSom());
	}

}
