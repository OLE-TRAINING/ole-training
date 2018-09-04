//
//  main.swift
//  Exercicio7
//
//  Created by Lorena Rodrigues Bruno on 24/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

var impares = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29]
var pares = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30]
var soma = Int()
var multiplicacao = 1

func somaImpares() {
    for numero in impares {
        soma = soma + numero
    }
    
    print("A soma dos números ímpares de 1 a 30 é: \(soma) ")
}

func multiplicaPares(){
    for numero in pares {
        multiplicacao = multiplicacao*numero
    }
    print("A multiplicação dos números pares de 1 a 30 é: \(multiplicacao) ")
}

somaImpares()
multiplicaPares()
