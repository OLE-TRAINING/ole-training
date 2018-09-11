//
//  main.swift
//  Exercicio5
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

//teste
//var ponto1 = Ponto(eixoX: 3, eixoY: 5)
//ponto1.imprimeCoordenada()
