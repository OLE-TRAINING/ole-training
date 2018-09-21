package Exer15Chapter4;

import Exer14Chapter4.Calculadora;

public class CalculadoraComercial extends Calculadora {

    public CalculadoraComercial(double x, double y) {
        super(x, y);
    }


    public int porcentagem(){
    	Calculadora c1 = new Calculadora(getX(), 100);
    	Calculadora c2 = new Calculadora(c1.multiplicacao(), getY());
    	return (int) c2.divisao();    	
    }
    
    
}
