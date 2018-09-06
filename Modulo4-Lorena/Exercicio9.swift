//
//  main.swift
//  Exercicio9
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class SalaDeAula {
    var nomeAluno = Array(repeating: " ", count: 10 )
    var numeroAlunos = 0
    
  
    func adicionaAlunos(nome: String) -> Bool{
        if numeroAlunos < 10 {
            nomeAluno.append(nome)
            numeroAlunos += 1
        } else {
            print("O número de alunos máximo para essa sala foi atingido. Não é possivel adicionar mais alunos.")
            return false
        }
        return true
    }
    
}

//teste
//var nome : String? = String()
//var sala1 = SalaDeAula()
//var flag = true
//
//while flag {
//    print("Digite o nome do aluno a ser adicionado à sala")
//    nome = readLine()
//    flag = sala1.adicionaAlunos(nome: nome!)
//}
//
//print("Numero de alunos: \(sala1.numeroAlunos)")


