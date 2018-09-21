package Exer14Chapter4;

import java.util.Scanner;

public class Exer14Chapter4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Digite o número da operacao desejada: ");
            System.out.println("1) Soma");
            System.out.println("2) Subtração");
            System.out.println("3) Multiplicação");
            System.out.println("4) Divisão");
            System.out.println("5) Sair");
            opcao = sc.nextInt();
            Calculadora calculadora = new Calculadora(0,0);
            switch (opcao) {
                case 1:
                    System.out.println("Digite dois valores para obter sua soma: ");
                    System.out.print("X: ");
                    calculadora.setX(sc.nextDouble());
                    System.out.print("Y: ");
                    calculadora.setY(sc.nextDouble());
                    System.out.println("Resultado: " + calculadora.soma());
                    break;
                case 2:
                    System.out.println("Digite dois valores para obter sua subtracao: ");
                    System.out.print("X: ");
                    calculadora.setX(sc.nextDouble());
                    System.out.print("Y: ");
                    calculadora.setY(sc.nextDouble());
                    System.out.println("Resultado: " + calculadora.subtracao());
                    break;
                case 3:
                    System.out.println("Digite dois valores para obter sua multiplicacao: ");
                    System.out.print("X: ");
                    calculadora.setX(sc.nextDouble());
                    System.out.print("Y: ");
                    calculadora.setY(sc.nextDouble());
                    System.out.println("Resultado: " + calculadora.multiplicacao());
                    break;
                case 4:
                    System.out.println("Digite dois valores para obter sua divisao: ");
                    System.out.print("X: ");
                    calculadora.setX(sc.nextDouble());
                    System.out.print("Y: ");
                    calculadora.setY(sc.nextDouble());
                    System.out.println("Resultado: " + calculadora.divisao());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Número inválido. Digite um número entre 1 e 5.");
            }
        } while (opcao != 5);
    }
}