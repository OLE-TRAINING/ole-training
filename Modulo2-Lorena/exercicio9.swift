//
//  main.swift
//  Exercicio9
//
//  Created by Lorena Rodrigues Bruno on 24/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

var entrada : String! = String()
var numero : Int = Int()
print("Digite um número inteiro de no máximo 4 dígitos")
entrada = readLine()
numero = Int(entrada)!


var digitos = [0, 0, 0, 0]

digitos[0] = numero/1000
digitos[1] = numero/100
digitos[2] = numero/10
digitos[3] = numero

digitos[3] = digitos[3] - (digitos[2]*10)
digitos[2] = digitos[2] - (digitos[1]*10)
digitos[1] = digitos[1] - (digitos[0]*10)

print("O numero \(numero) invertido é: \(digitos[3])\(digitos[2])\(digitos[1])\(digitos[0])")


