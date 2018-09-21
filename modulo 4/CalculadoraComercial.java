package ExerciciosChapter4;

public class CalculadoraComercial {
    private Calculadora calc = new Calculadora();

    public Calculadora getCalc() {
        return calc;
    }

    public void setCalc(Calculadora calc) {
        this.calc = calc;
    }

    public int calculaPorcentagem(double elem01, double elem02){
        double result =((elem02*100.0)/elem01);
        return (int) result;
    }
}