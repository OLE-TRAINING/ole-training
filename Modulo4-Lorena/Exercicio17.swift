//
//  main.swift
//  Exercicio17
//
//  Created by Lorena Rodrigues Bruno on 28/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation


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
    }
    
}

class SalaDeAula {
    var alunos : [Pessoa] = [Pessoa]()
    var numeroAlunos = 0
    var numeroDaSala : Int? = Int()
    
    init() {
        print("Número da sala:")
        numeroDaSala = Int(readLine()!)
        adicionaAluno()
    }
    
    func adicionaAluno() {
        var opcao : String? = String()
        repeat {
            print("\nMenu da sala \(numeroDaSala!)\n1-Adicionar aluno\n2-Sair da sala")
            opcao = readLine()
            if opcao == "1" {
                if numeroAlunos < 10 {
                    let pessoa = Pessoa()
                    alunos.append(pessoa)
                    numeroAlunos += 1
                } else {
                    print("O número de alunos máximo para essa sala foi atingido. Não é possivel adicionar mais alunos.")
                }
            } else if opcao != "2"{
                print("Opção inválida!")
            }
            
        }while opcao != "2"
        
    }
    
    
}

class Escola {
    var nomeEscola : String? = String()
    var CNPJ : String? = String()
    var salas : [SalaDeAula] = [SalaDeAula]()
    var contadorDeSalas = 0
    init() {
        print("Nome da Escola: ")
        nomeEscola = readLine()
        print("CNPJ: ")
        CNPJ = readLine()
    }
    
    func adicionarSalas () {
        if contadorDeSalas == 20 {
            print("Não é possivel adicionar mais salas a esta escola.")
        } else {
            let novaSala = SalaDeAula()
            salas.append(novaSala)
            
        }
    }
    
    func transferirAluno() {
        for (indexSala, valueSala) in salas.enumerated() {
            print("Index \(indexSala): Sala \(valueSala.numeroDaSala!)")
            for (indexAluno, valueAluno) in salas[indexSala].alunos.enumerated() {
                print("Index \(indexAluno): \(valueAluno.nome!)\n")
            }
        }
        print("Entre com o index da sala na qual o aluno deve ser retirado: ")
        let salaSaida : Int? = Int(readLine()!)
        print("Entre com o index da sala na qual o aluno deve ser inserido: ")
        let salaEntrada : Int? = Int(readLine()!)
        print("Entre com o index do aluno a ser transferido: ")
        let alunoTransferencia : Int? = Int(readLine()!)
        
        salas[salaEntrada!].alunos.append(salas[salaSaida!].alunos[alunoTransferencia!])
        salas[salaEntrada!].numeroAlunos += 1
        salas[salaSaida!].alunos.remove(at: alunoTransferencia!)
        salas[salaEntrada!].numeroAlunos -= 1
        
        //teste de transferencia
//        for (indexSala, valueSala) in salas.enumerated() {
//            print("Index \(indexSala): Sala \(valueSala.numeroDaSala!)")
//            for (indexAluno, valueAluno) in salas[indexSala].alunos.enumerated() {
//                print("Index \(indexAluno): \(valueAluno.nome!)")
//            }
//        }
    }
    
    
    
}

//teste
//var opcao : String? = String()
//var escola = Escola()
//escola.adicionarSalas()
//repeat {
//    print("\nMenu de cadastro:\n1-AdicionarSalas\n2-Transferir Aluno\n3-Sair")
//    opcao = readLine()
//    if opcao == "1" {
//        print("\nAdicionar sala:")
//        escola.adicionarSalas()
//    }
//     else if opcao == "2" {
//        escola.transferirAluno()
//    }
//}while opcao != "3"


