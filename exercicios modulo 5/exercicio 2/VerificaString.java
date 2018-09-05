public class VerificaString {
	private String string;

	// metodos getters e setters
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void checkString(String str) {
		String auxiliar = str;

		if (auxiliar.length() < 8) {
			System.out.println("Erro: string " + str + " com menos de 8 caracteres!!");
		}

		if (!(str.charAt(0) == 'A')) {
			System.out.println("Erro: string nao começa com A");
		}
	}
}