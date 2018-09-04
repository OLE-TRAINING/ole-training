package ExerciciosChapter4;

public class Contador {
    private int valorInicial = 0;
    private int incrementar = 0;
    private int decrementar = 0;
    private int valorAtual= 0;

    public Contador (int valorInicial){
        this.valorInicial=valorInicial;
    }

    public Integer getValorInicial(){
        return this.valorInicial;
    }

    public void setValorInicial(int start){
        this.valorInicial = start;
    }

    public Integer getIncrementar(){
        return this.incrementar;
    }

    public void setIncrementar(int add){
        this.incrementar = add;
    }

    public Integer getDecrementar(){
        return this.decrementar;
    }

    public void setDecrementar(int sub){
        this.decrementar = sub;
    }

    public Integer getValorAtual(){
        return this.valorAtual;
    }

    public void setValorAtual(int end){
        this.valorAtual = end;
    }

    public void showValorInicial (){
        System.out.println(this.valorInicial);
    }

    public void incrementar (){
        this.valorInicial = this.valorInicial+1;
    }

    public void decrementar (){
        this.valorInicial = this.valorInicial-1;
    }

    public void showValorAtual(){
        this.valorAtual = this.valorInicial;
        System.out.println(this.valorAtual);
    }
}