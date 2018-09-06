//
//  main.swift
//  Exercicio14
//
//  Created by Lorena Rodrigues Bruno on 27/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

//não encontrei nenhuma classe em swift que correspondo à classe Scanner em Java, portanto, o exercicio foi resolvido da forma normal

var progressaoAritmetica : [Int?] = [0,0,0,0,0,0,0,0,0,0]

print("Digite uma sequencia de 10 números")

for contador in 1...10 {
    progressaoAritmetica[contador] = Int(readLine()!)
}

var constante : Int = progressaoAritmetica[1]! - progressaoAritmetica[0]!

for index in 1...9 {
    if progressaoAritmetica[index+1]! - progressaoAritmetica[index]! != constante {
        print("Essa sequencia não é uma Progressão Aritmética")
        break
    }
    
    if (index == 9){
        print("Essa sequencia é uma Progressão Aritmética")
    }
}
