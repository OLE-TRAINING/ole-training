//
//  main.swift
//  Exercicios12a15
//
//  Created by Lorena Rodrigues Bruno on 03/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

enum Erro : Error {
    case saldoInsuficiente
}

protocol operacoesBancarias {
    func sacar(valor: Int) throws
    func depositar(valor: Int)
    func consultarSaldo()
}

class ContaCorrente : operacoesBancarias {
    var saldoTotal = Int()
    
    init(valorSaldo: Int) {
        self.saldoTotal = valorSaldo
    }
    
    func sacar(valor: Int) throws {
        if saldoTotal < valor {
            throw Erro.saldoInsuficiente
        } else {
            self.saldoTotal -= valor
        }
        
    }
    
    func depositar(valor: Int){
        self.saldoTotal += valor
    }
    func consultarSaldo(){
        print("Saldo total: \(self.saldoTotal)")

    }
    
}

class ContaCorrenteEspecial: ContaCorrente {
    var limiteExtra = Int()
    var limiteChequeEspecial = Int()
    
    init(valorLimite: Int, valorSaldo: Int) {
        self.limiteExtra = valorLimite
        self.limiteChequeEspecial = valorLimite
        super.init(valorSaldo: valorSaldo)
    }
    
    override func sacar(valor: Int) throws {
        if saldoTotal >= valor {
            saldoTotal -= valor
        } else if limiteChequeEspecial >= valor {
            limiteChequeEspecial -= valor
        } else {
            throw Erro.saldoInsuficiente
        }
        
    }
    
    override func depositar(valor: Int){
        if limiteChequeEspecial < limiteExtra {
            limiteChequeEspecial += valor
        } else {
            saldoTotal += valor
        }
        
    }
    override func consultarSaldo() {
        print("Saldo total: \(self.saldoTotal)")
        print("Limite extra: \(self.limiteExtra)")
        print("Limite disponível: \(self.limiteChequeEspecial)")


    }
    
}

//teste
//var contaCorrente = ContaCorrente(valorSaldo: 50)
//contaCorrente.depositar(valor: 100)
//try contaCorrente.sacar(valor: 20)
//contaCorrente.consltarSaldo()
//try contaCorrente.sacar(valor: 140)
//
//var contaEspecial = ContaCorrenteEspecial(valorLimite: 700, valorSaldo: 100)
//try contaEspecial.sacar(valor: 130)
//contaEspecial.consultarSaldo()
//contaEspecial.depositar(valor: 230)
//contaEspecial.consultarSaldo()
//try contaEspecial.sacar(valor: 1000)



