//
//  main.swift
//  Exercicio15
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class CalculadoraComercial {
   
    func porcentagem(valorTotal : Double, porcentagem: Int) -> Double {
        return valorTotal*(Double(porcentagem)/100.0)
    }
}

class Calculadora {
    
    
    func soma(valor1 : Double, valor2: Double) -> Double {
        return valor1 + valor2
    }
    
    func subtracao(valor1 : Double, valor2: Double) -> Double {
        return valor1 - valor2
    }
    
    func divisao(valor1 : Double, valor2: Double) -> Double {
        return valor1 / valor2
    }
    
    func multiplicacao(valor1 : Double, valor2: Double) -> Double {
        return valor1 * valor2
    }
    
    
    
}

//Programa
var calculadora = Calculadora()
var calculadoraComercial = CalculadoraComercial()
print("Menu calculadora comercial:\n1-Soma\n2-Subtracao\n3-Divisão\n4-Multiplicacao\n5-Porcentagem")
var opcao : String? = readLine()

var valor1 : Double! = Double()
var valor2 : Double! = Double()
var porcentagem : Int! = Int()
var resultado = Double()

func solicitaParametros() {
    print("Digite o primeiro parâmetro:")
    valor1 = Double(readLine()!)
    if opcao == "5" {
        print("Digite a porcentagem:")
        porcentagem = Int(readLine()!)
    } else {
        print("Digite o segundo parâmetro:")
        valor2 = Double(readLine()!)
    }
}


switch opcao {
case "1":
    solicitaParametros()
    resultado = calculadora.soma(valor1: valor1, valor2: valor2)
    print("O resultado da soma é: \(resultado)")
case "2":
    solicitaParametros()
    resultado = calculadora.subtracao(valor1: valor1, valor2: valor2)
    print("O resultado da subtracao é: \(resultado)")
case "3":
    solicitaParametros()
    resultado = calculadora.divisao(valor1: valor1, valor2: valor2)
    print("O resultado da divisao é: \(resultado)")
case "4":
    solicitaParametros()
    resultado = calculadora.multiplicacao(valor1: valor1, valor2: valor2)
    print("O resultado da multiplicacao é: \(resultado)")
case "5":
    solicitaParametros()
    resultado = calculadoraComercial.porcentagem(valorTotal: valor1, porcentagem: porcentagem)
    print("O resultado da multiplicacao é: \(resultado)")
default:
    solicitaParametros()
    print("Opcao Invalida!")
}
