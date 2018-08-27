//
//  main.swift
//  Exercicio10
//
//  Created by Lorena Rodrigues Bruno on 24/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

print("Digite um número:")
var entrada : String! = readLine()
var numero : Int = Int(entrada)!
var contador = 1

for contador in 2...numero-1 {
    if numero%contador == 0 {
        print("O número \(numero) não é primo!")
        break
    }
    if contador == numero-1 {
        print("O número \(numero) é primo!")
    }
}




