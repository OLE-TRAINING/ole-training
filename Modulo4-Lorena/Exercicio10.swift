//
//  main.swift
//  Exercicio10
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
        print("Endereco:\nRua/Avenida \(rua), Bairro:\(bairro), CEP:\(cep)\n\(cidade)-\(estado)\nTelefone:\(telefone)")
    }
    
}

//teste
//var endereco = Endereco(estado: "MG", cidade: "Uberlândia", bairro: "Santa Mônica", rua: "João Naves de Ávila", cep: "38000-000", telefone: "9999-9999")
//endereco.imprimeEndereco()

