package ExerciciosChapter4;

public class Endereco {
    private String estado = "";
    private String cidade = "";
    private String bairro = "";
    private String rua = "";
    private String cep = "";
    private String telefone = "";

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void endStatus(){
        System.out.println(getEstado());
        System.out.println(getCidade());
        System.out.println(getBairro());
        System.out.println(getRua());
        System.out.println(getCep());
        System.out.println(getTelefone());
    }
}
