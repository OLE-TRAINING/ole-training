//
//  main.swift
//  Exercicio11
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Endereco{
    var estado = String()
    var cidade = String()
    var bairro = String()
    var rua = String()
    var cep = String()
    var telefone = String()
    
    init(estado: String, cidade: String, bairro: String, rua: String, cep: String, telefone: String) {
        self.estado = estado
        self.cidade = cidade
        self.bairro = bairro
        self.rua = rua
        self.cep = cep
        self.telefone = telefone
    }
    
    func imprimeEndereco() {
        print("Endereço:\nRua/Avenida \(rua), Bairro:\(bairro), CEP:\(cep)\n\(cidade)-\(estado)\nTelefone:\(telefone)")
    }
    
}

class Pessoa {
    var nome = String()
    var idade = Int()
    var CPF = String()
    var endereco = Endereco(estado: "MG", cidade: "Uberlândia", bairro: "Santa Mônica", rua: "João Naves de Ávila", cep: "38000-000", telefone: "9999-9999")
    
    init(nome : String, idade : Int, CPF : String) {
        self.nome = nome
        self.idade = idade
        self.CPF = CPF
    }
    
    func imprimeInformacoes() {
        print("\(nome), de numero de CPF: \(CPF), tem \(idade) anos.")
        endereco.imprimeEndereco()
    }
}

//teste
//var pessoa = Pessoa(nome: "Maria", idade: 25, CPF: "111222333-44")
//pessoa.imprimeInformacoes()
