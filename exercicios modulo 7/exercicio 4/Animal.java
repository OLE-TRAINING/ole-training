
public class Animal {
	private String nome;
	private int idade;
	private String som;
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getSom() {
		return this.som;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	
	public void setSom(String som) {
		this.som=som;
	}
	
	public void showYourself() {
		System.out.println("Nome:"+nome);
		System.out.println("Idade:"+idade);
		System.out.println("Som:"+som);
	}
	
	public void fazerBarulho() {
		System.out.println(som);
	}
}
