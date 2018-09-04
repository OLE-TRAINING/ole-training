//
//  main.swift
//  Exercicio7
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Pessoa {
    var nome = String()
    var idade = Int()
    var CPF = String()
    
    init(nome : String, idade : Int, CPF : String) {
        self.nome = nome
        self.idade = idade
        self.CPF = CPF
    }
    
    func imprimeInformacoes() {
        print("\(nome), de numero de CPF: \(CPF), tem \(idade) anos. ")
    }
}

var pessoa1 = Pessoa(nome: "Maria", idade: 25, CPF: "123456789-10")
pessoa1.imprimeInformacoes()
var pessoa2 = Pessoa(nome: "João", idade: 18, CPF: "222555777-10")
pessoa2.imprimeInformacoes()
