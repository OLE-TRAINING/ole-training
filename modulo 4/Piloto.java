package ExerciciosChapter4;

class Piloto {
    private String nome;
    private Integer habilidade = 75;
    private Integer idade;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public Integer getHabilidade(){
        return this.habilidade;
    }

    public void setHabilidade(Integer hb){
        this.habilidade = hb;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void setIdade(Integer id){
        this.idade = id;
    }
}