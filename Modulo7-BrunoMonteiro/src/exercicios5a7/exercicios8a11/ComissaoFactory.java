package exercicios5a7.exercicios8a11;

/*
 * Factory para gerar comissões
 * */
public class ComissaoFactory {

	public static Comissao getComissao(String tipoComissao) {
		if (tipoComissao.equals("vendedor")) {
			return new Vendedor();
		} else if (tipoComissao.equals("gerente")) {
			return new Gerente();
		} else if (tipoComissao.equals("supervisor")) {
			return new Supervisor();
		}
		return null;
	}
}
