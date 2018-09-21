package Exer14Chapter4;

public class Calculadora {
    private double x;
    private double y;

    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double soma(){
        return x+y;
    }

    public double subtracao(){
        return x-y;
    }

    public double multiplicacao(){
        return x*y;
    }

    public double divisao(){
        return x/y;
    }
}