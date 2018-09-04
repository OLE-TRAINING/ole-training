//
//  main.swift
//  Exercicios9e10
//
//  Created by Lorena Rodrigues Bruno on 03/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

enum Erro: Error  {
    case invalidaValue
    case equalValues
    
}

protocol FiguraGeometrica {
    func calcularArea() -> Double
    func calcularPerimetro() -> Double
}

class Quadrilatero : FiguraGeometrica{
    var lado1=0.0, lado2=0.0, lado3=0.0, lado4=0.0
    init(lado1:Double, lado2:Double, lado3: Double, lado4:Double) {
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
        self.lado4 = lado4
    }
    
    func calcularPerimetro() -> Double {
        return lado1 + lado2 + lado3 + lado4
    }
    
    func calcularArea() -> Double {
        return lado1 * lado3
    }
}

class Quadrado: Quadrilatero {
    init(lado: Double) throws {
        if lado <= 0 {
            print("Valor inválido, o valor esperado é maior que 0 (zero)")
            throw Erro.invalidaValue
        } else {
            super.init(lado1: lado, lado2: lado, lado3: lado, lado4: lado)
        }
        
    }
}

//teste
print("Digite o valor do lado do quadrado: ")
var entrada : String? = String()
entrada = readLine()
var ladoQuadrado = Double(entrada!)!
var quadrado = try Quadrado(lado: ladoQuadrado)

print("Perímetro do quadrado: \(quadrado.calcularPerimetro())")
print("Área do quadrado: \(quadrado.calcularArea())")



