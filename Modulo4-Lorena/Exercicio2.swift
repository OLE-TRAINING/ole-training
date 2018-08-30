//
//  main.swift
//  Exercicio1
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class CarroCorrida {
    var numeroIdentificao = Int()
    var velocidadeAtual = 0.0
    var velocidadeMaxima = 100.0
    
    init(velocidadeMaxima : Double) {
        
        self.velocidadeMaxima = velocidadeMaxima
    }
    
}

//testes:
//var carro1 = CarroCorrida(velocidadeMaxima: 160)
//print("Velocidade Máxima: \(carro1.velocidadeMaxima)")


