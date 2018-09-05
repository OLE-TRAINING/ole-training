//
//  main.swift
//  Exercicio13
//
//  Created by Lorena Rodrigues Bruno on 04/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation


//Em swift, HashSet pode ser representado por Set
var novoSet: Set = Set<String>()
for index in 0...19_999 {
    novoSet.insert("Aluno\(index)")
}

if novoSet.contains("Aluno15245") {
    print("Aluno encontrado.")
} else {
    print("Aluno não encontrado.")
}


//Em swift, HashSet pode ser representado por Dictionary
var novoDictionary = [Int: String]()
for index in 0...19_999 {
    novoDictionary[index] = "Aluno\(index)"
}
if novoDictionary[15245] == "Aluno15245" {
    print("Aluno encontrado.")
} else {
    print("Aluno não encontrado.")
}



