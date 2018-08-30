//
//  main.swift
//  Exercicio	16
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

class Conta {
    var numeroDaConta = String()
    var saldo = Int()
    var limite = Int()
    var pessoa = Pessoa(nome: "Maria", idade: 32, CPF: "000111222-33")
    
    init(numeroDaConta: String, saldo: Int, limite: Int) {
        self.numeroDaConta = numeroDaConta
        self.limite = limite
        self.saldo = saldo
    }
    
    func depositar(valorDoDeposito : Int) {
        saldo += valorDoDeposito
    }
    
    func sacar(valorDoSaque : Int) -> Bool {
        if saldo > valorDoSaque && valorDoSaque < limite {
            saldo -= valorDoSaque
            return true
        } else {
            return false
        }
    }
    
    func verificarSaldo() {
        print("Seu saldo é de R$\(saldo)")
    }
}

//teste
//var verificador : Bool = true
//var conta = Conta(numeroDaConta: "1234", saldo: 5_000, limite: 500)
//conta.depositar(valorDoDeposito: 700)
//verificador = conta.sacar(valorDoSaque: 200)
//if(verificador == false) {
//    print("Operação inválida")
//}
//conta.verificarSaldo()


