package ExerciciosChapter4;

public class Exer15cap4 {

    public static void main (String args[]){
        CalculadoraComercial calc = new CalculadoraComercial();
        System.out.println("Soma: " + calc.getCalc().soma(4.0,2.0));
        System.out.println("Subtração: " + calc.getCalc().subtracao(4.0,2.0));
        System.out.println("Divisão: " + calc.getCalc().divisao(4.0,2.0));
        System.out.println("Multiplicação: " + calc.getCalc().multiplicacao(4.0,2.0));
        System.out.println("Porcentagem: " + calc.calculaPorcentagem(4.0,2.0) + "%");
    }
}