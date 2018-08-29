
public class Execute {

	public static void main(String[] args) {
		Cachorro viralata = new Cachorro();
	    Cavalo cavalao = new Cavalo();
	    Preguiça preguica = new Preguiça();
	    
		
		Zoologico zoologico = new Zoologico();
		
		viralata.setSom("Au AU AU AU UUUUUUu");
		cavalao.setSom("hihiiiihHIHIHhIHihIHHIHIHihihih");
		preguica.setSom("?????????");
		
		
		zoologico.colocaAnimalJaula(cavalao);
		zoologico.colocaAnimalJaula(preguica);
		zoologico.colocaAnimalJaula(viralata);
		
		
		
		zoologico.goToJails();
		
		
		
	}
	
	static void emitirSom(Animal aa) {
		System.out.println(aa.getSom());
	}

}
