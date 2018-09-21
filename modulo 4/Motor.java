package ExerciciosChapter4;

public class Motor {
    private int potencia;

    public Motor (int power){
        this.potencia = power;
        controlaPotencia();
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int pt) {
        this.potencia = pt;
    }

    public void controlaPotencia(){
        if(getPotencia() <=1) {
            setPotencia(1);
        } else if (getPotencia()>=100){
            setPotencia(100);
        }
    }

    public void aumentarPotencia(){
        while(getPotencia()<=100){
            setPotencia(getPotencia()+1);
        }
    }
}
