//
//  main.swift
//  Exercicio19
//
//  Created by Lorena Rodrigues Bruno on 24/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

var impares = [15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35]

func calculaQuadradoImpares() {
    for numero in impares {
        var resultadoQuadrado = numero*numero
        print("O quadrado de \(numero) é \(resultadoQuadrado)")
    }
}

calculaQuadradoImpares()
