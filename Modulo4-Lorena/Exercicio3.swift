//
//  main.swift
//  Exercicio3
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class CarroCorrida {
    var numeroIdentificao = Int()
    var velocidadeAtual = 0.0
    var velocidadeMaxima = 100.0
    var piloto = Piloto(nome: "João", habilidade: 5, idade: 32)
    var motor = Motor(potencia: 7)
    
    init(velocidadeMaxima : Double) {
        
        self.velocidadeMaxima = velocidadeMaxima
    }
    
    func acelerar() {
        self.velocidadeAtual += (10.0 + Double(piloto.habilidade)*0.1 + Double(motor.potencia)*0.1)
        if velocidadeAtual > velocidadeMaxima {
            velocidadeAtual = velocidadeMaxima
        }
    }
    
}

class Piloto {
    var nome = String()
    var habilidade = Int()
    var idade = Int()
    
    init() {
        
    }
    
    init(nome : String, habilidade : Int, idade : Int) {
        self.nome = nome
        self.habilidade = habilidade
        self.idade = idade
    }
    
}

class Motor {
    var potencia = Int()
    
    init() {
        
    }
    
    init(potencia : Int) {
        if potencia < 0 {
            self.potencia = 0
        } else if potencia > 100 {
            self.potencia = 100
        } else {
            self.potencia = potencia
        }
    }
}

//teste
//var carro1 = CarroCorrida(velocidadeMaxima: 150.0)
//carro1.acelerar()
//print("Velocidade atual: \(carro1.velocidadeAtual)")




