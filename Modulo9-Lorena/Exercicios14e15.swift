//
//  main.swift
//  Exercicios14e15
//
//  Created by Lorena Rodrigues Bruno on 04/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class ContaCorrente {
    var agencia = String()
    var numeroConta = String()
    var nome = String()
    var cpf = String()
    var saldo = Double()
    
    init(agencia: String, numeroConta: String, nome: String, cpf: String, saldo: Double) {
        self.agencia = agencia
        self.numeroConta = numeroConta
        self.nome = nome
        self.cpf = cpf
        self.saldo = saldo
    }
    func equals(conta1 : ContaCorrente, conta2  : ContaCorrente) -> Bool {
        if(conta1.agencia == conta2.agencia && conta1.numeroConta == conta2.numeroConta) {
            return true
        }
        
        return false
    }
    
    func hashCode(agencia : String, numeroConta : String) -> Int {
        return Int(agencia+numeroConta)!
    }
}

var contas = [Int: ContaCorrente]()
var conta1 = ContaCorrente(agencia: "0000", numeroConta: "000012154", nome: "Maria", cpf: "654687868", saldo: 980.0)
contas[conta1.hashCode(agencia: conta1.agencia, numeroConta: conta1.numeroConta)] = conta1
var conta2 = ContaCorrente(agencia: "0007", numeroConta: "000012154", nome: "Ana", cpf: "6556411168", saldo: 1500.0)
contas[conta2.hashCode(agencia: conta2.agencia, numeroConta: conta2.numeroConta)] = conta2
var conta3 = ContaCorrente(agencia: "0000", numeroConta: "000012154", nome: "João", cpf: "0000125489", saldo: 80.0)
contas[conta3.hashCode(agencia: conta3.agencia, numeroConta: conta3.numeroConta)] = conta3
var conta4 = ContaCorrente(agencia: "9987", numeroConta: "154784157", nome: "Pedro", cpf: "121234844", saldo: 520.0)
contas[conta4.hashCode(agencia: conta4.agencia, numeroConta: conta4.numeroConta)] = conta4
var conta5 = ContaCorrente(agencia: "2252", numeroConta: "987897443", nome: "José", cpf: "465468111", saldo: 0.0)
contas[conta5.hashCode(agencia: conta5.agencia, numeroConta: conta5.numeroConta)] = conta5

for (identificador, conta) in contas {
    print("\(identificador) : \(conta.numeroConta) - \(conta.nome)")
}
