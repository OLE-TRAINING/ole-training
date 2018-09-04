//
//  main.swift
//  Exercicio13
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Endereco{
    var estado : String? = String()
    var cidade : String? = String()
    var bairro : String? = String()
    var rua : String? = String()
    var cep : String? = String()
    var telefone : String? = String()
    
    init() {
        print("Rua/Avenida: ")
        self.rua = readLine()
        print("Bairro: ")
        self.bairro = readLine()
        print("Cidade: ")
        self.cidade = readLine()
        print("Estado: ")
        self.estado = readLine()
        print("CEP: ")
        self.cep = readLine()
        print("Telefone: ")
        self.telefone = readLine()
        print("\n")
    }
    
    
}

class Pessoa {
    var nome : String? = String()
    var idade : Int? = Int()
    var CPF : String? = String()
    
    init() {
        print("Nome: ")
        nome = readLine()
        print("Idade: ")
        idade = Int(readLine()!)
        print("CPF:")
        CPF = readLine()
        var endereco = Endereco()
    }

}

class CadastroPessoal {
    var armazenamentoCadastros : [Pessoa] = [Pessoa]()
    var contadorDeCadastros = 0
    
    func cadastrar () {
        if contadorDeCadastros == 100 {
            print("Armazenameto cheio!")
        } else {
            let pessoa = Pessoa()
            armazenamentoCadastros.append(pessoa)
            contadordeCadastros += 1
        }
    }
    
   func removerCadastro () {
    for (index, value) in armazenamentoCadastros.enumerated() {
        print("Item \(index): \(value.nome!)")
    }
    print("Entre com o item que deseja remover: ")
    let itemARemover : Int? = Int(readLine()!)
    armazenamentoCadastros.remove(at: itemARemover!)
    
    //testa se o elemento foi removido
//    print("\nNova lista de cadastros:")
//    for (index, value) in armazenamentoCadastros.enumerated() {
//        print("Item \(index): \(value.nome!)")
//    }
//    contadorDeCadastros -= 1

    }
}

//teste
//var opcao : String? = String()
//var cadastro = CadastroPessoal()
//
//repeat {
//    print("Menu de cadastro:\n1-Cadastrar pessoa\n2-Remover cadastro\n3-Sair")
//    opcao = readLine()
//    if opcao == "1" {
//        cadastro.cadastrar()
//    }
//     else if opcao == "2" {
//        cadastro.removerCadastro()
//    }
//}while opcao != "3"




