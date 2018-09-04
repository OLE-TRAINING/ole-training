
public class Endereço {
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private String cep;
	private String telefone;
	
    //metodos getters
	public String getEstado() {
		return this.estado;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	//metodos setters
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	public void setBairro(String bairro) {
		this.bairro=bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade=cidade;
	}
	
	public void setRua(String rua) {
		this.rua=rua;
	}
	
	public void seCep(String cep) {
		this.cep=cep;
	}
	
	public void setTelefone(String telefone) {
		this.telefone=telefone;
	}
	
}
