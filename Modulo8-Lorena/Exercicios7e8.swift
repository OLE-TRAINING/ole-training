//
//  main.swift
//  Exercicios7e8
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

class Retangulo: Quadrilatero {
    init(base: Double, altura: Double) throws{
        guard base > 0 && altura > 0 else {
            print("Valor inválido, o valor esperado é maior que 0 (zero)")
            throw Erro.invalidaValue
        }
        guard base != altura else {
            print("Valor inválido, modifique um dos valores a fim de torná-los diferentes")
            throw Erro.equalValues
            
        }
        super.init(lado1: base, lado2: base, lado3: altura, lado4: altura)
    }
}

//teste
//print("Quadrado:")
//var quadrado = try Quadrado(lado: -2)
//print("Perímetro do quadrado: \(quadrado.calcularPerimetro())")
//print("Área do quadrado: \(quadrado.calcularArea())")
//
//print("Retângulo")
//var retangulo = try Retangulo(base:3, altura:3)
//print("Perímetro do quadrado: \(retangulo.calcularPerimetro())")
//print("Área do quadrado: \(retangulo.calcularArea())")

