//
//  main.swift
//  Exercicios16a20
//
//  Created by Lorena Rodrigues Bruno on 04/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Aluno {
    var nome = String()
    var rg = String()
    var idade = Int()
    
    init (nome: String, rg: String, idade: Int) {
        self.nome = nome
        self.rg = rg
        self.nome = nome
    }
    
    func equals(aluno1 : Aluno, aluno2  : Aluno) -> Bool {
        if(aluno1.rg == aluno2.rg) {
            return true
        }
        
        return false
    }
    
    func hashCode(rg : String) -> Int {
        return Int(rg)!
    }
}

//Foi utilizada a coleção Dictionary do Swift
var turma = [Int : Aluno]()
var aluno1 = Aluno(nome: "João", rg: "154876122", idade: 15)
turma[aluno1.hashCode(rg: aluno1.rg)] = aluno1
var aluno2 = Aluno(nome: "Maria", rg: "548977774", idade: 16)
turma[aluno2.hashCode(rg: aluno2.rg)] = aluno2
var aluno3 = Aluno(nome: "Paulo", rg: "154944444", idade: 15)
turma[aluno3.hashCode(rg: aluno3.rg)] = aluno3
var aluno4 = Aluno(nome: "Mariana", rg: "002489999", idade: 17)
turma[aluno4.hashCode(rg: aluno4.rg)] = aluno4
var aluno5 = Aluno(nome: "Mariano", rg: "002489999", idade: 16)
turma[aluno5.hashCode(rg: aluno5.rg)] = aluno5

for (identificador, aluno) in turma {
    print("\(identificador) : \(aluno.nome)")
}


