//
//  main.swift
//  Exercicio6
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Ponto {
    var eixoX = Int()
    var eixoY = Int()
    
    init(eixoX : Int, eixoY : Int) {
        self.eixoX = eixoX
        self.eixoY = eixoY
    }
    
    func imprimeCoordenada() {
        print("Coordenadas do ponto: (\(eixoX),\(eixoY)) ")
    }
    
}
class Triangulo {
    var vertice1 = Ponto(eixoX: 5, eixoY: 2)
    var vertice2 = Ponto(eixoX: 9, eixoY: 2)
    var vertice3 = Ponto(eixoX: 7, eixoY: 4)
    

}

//teste
//var triangulo = Triangulo()
//print("Coordenada ds vértices do triângulo:")
//triangulo.vertice1.imprimeCoordenada()
//triangulo.vertice2.imprimeCoordenada()
//triangulo.vertice3.imprimeCoordenada()

