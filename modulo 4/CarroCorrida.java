package ExerciciosChapter4;

class CarroCorrida {
    public Double velocidadeMaxima;
    private Integer numeroIdentificacao;
    private Double velocidadeAtual;
    private Piloto piloto;
    private Motor motor;

    public CarroCorrida(Double velocidadeMaxima) {

        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Integer getNumeroIdentificacao(){
        return this.numeroIdentificacao;
    }

    public void setNumeroIdentificacao(Integer ni){
        this.numeroIdentificacao = ni;
    }

    public double getVelocidadeAtual(){
        acelerar();
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(double va){
        this.velocidadeAtual = va;
    }

    public Piloto getPiloto(){
        return this.piloto;
    }

    public void setPiloto(Piloto pi){
        this.piloto = pi;
    }

    public Motor getMotor(){
        return this.motor;
    }

    public void setMotor(Motor mo){
        this.motor = mo;
    }

    public void acelerar() {
        motor.aumentarPotencia();
        velocidadeAtual += 10 + (piloto.getHabilidade() * 0.1) + (motor.getPotencia()*0.1);
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }
}