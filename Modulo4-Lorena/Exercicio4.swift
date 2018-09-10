//
//  main.swift
//  Exercicio4
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Contador {
    var valorAtual = Int()
    
    init(valorAtual : Int) {
        self.valorAtual = valorAtual
    }
    
    func incrementaValorAtual (incremento : Int) {
        valorAtual += incremento
    }
    
    func decrementaValorAtual (decremento : Int) {
        valorAtual -= decremento
    }
    
    func imprimeValorAtual(){
        print("Valor atual: \(valorAtual)")
    }
}

//teste:
//var contador = Contador(valorAtual: 15)
//contador.incrementaValorAtual(incremento: 10)
//contador.decrementaValorAtual(decremento: 7)
//contador.imprimeValorAtual()


