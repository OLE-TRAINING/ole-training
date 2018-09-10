//
//  main.swift
//  Exercicio11
//
//  Created by Lorena Rodrigues Bruno on 24/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

print ("Digite o valor integral do salário: ")
var entradaSalario : String! = readLine()
print ("Digite o número de dias trabalhados: ")
var entradaDias : String! = readLine()

var salarioIntegral : Float! = Float(entradaSalario)
var diasTrabalhados : Float! = Float(entradaDias)

var salarioProporcional : Float = (salarioIntegral/22.0) * diasTrabalhados

print("O salário do funcionário esse mês será de: \(salarioProporcional)l")

