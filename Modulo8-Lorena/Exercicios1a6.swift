//
//  main.swift
//  Exercicios1a6
//
//  Created by Lorena Rodrigues Bruno on 30/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

//O exercicio pedia implementação utilizando classe abstrata, porém a linguagem swift não trabalha com esse conceito. Portanto, o exercicio foi resolvido utilizando Protocolo


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
    init(lado: Double){
        super.init(lado1: lado, lado2: lado, lado3: lado, lado4: lado)
    }
}

class Retangulo: Quadrilatero {
    init(base: Double, altura: Double){
        super.init(lado1: base, lado2: base, lado3: altura, lado4: altura)
    }
}

//teste
var quadrado = Quadrado(lado: 2)
print("Perímetro do quadrado: \(quadrado.calcularPerimetro())")
print("Área do quadrado: \(quadrado.calcularArea())")

var retangulo = Retangulo(base:3, altura:2)
print("Perímetro do quadrado: \(retangulo.calcularPerimetro())")
print("Área do quadrado: \(retangulo.calcularArea())")

