public class Pessoa {
  private String nome;
  private int idade;
  private String cpf;
  
  public Pessoa() {
	  
  }
  
  public Pessoa(String nome,int idade,String cpf) {
	  this.nome = nome;
	  this.idade = idade;
	  this.cpf = cpf;
  }
  
  //metodos getters e setters
  public String getNome() {
	  return this.nome;
  }
  
  public int getIdade() {
	  return this.idade;
  }
  
  public String getCpf() {
	  return this.cpf;
  }
  
  public void setNome(String Nome) {
	  this.nome = Nome;
  }
  
  public void setIdade(int Idade) {
	  this.idade = Idade;
  }
  
  public void setCpf(String Cpf) {
	  this.nome = Cpf;
  }
}
