package Exer13Chapter4;

public class Person {

    private String nome;
    private Integer idade;
    private String cpf;
    private Address endereco;


    public Address getEndereco() {
        return endereco;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.getEndereco().getTelefone());
        System.out.println("Rua: " +this.getEndereco().getRua());
        System.out.println("CEP: " + this.getEndereco().getCep());
        System.out.println("Bairro: " + this.getEndereco().getBairro());
        System.out.println("Cidade: " +this.getEndereco().getCidade());
        System.out.println("Estado: " + this.getEndereco().getEstado());
    }
}
