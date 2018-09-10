//
//  main.swift
//  Exercicio17
//
//  Created by Lorena Rodrigues Bruno on 24/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

func calculaAreaTrapezio (altura : Float, baseMaior : Float, baseMenor : Float) -> Float {
    let resultado : Float = ((baseMaior + baseMenor)*altura)/2
    return resultado
}
var altura : Float = 1.5
var baseMaior : Float = 3.0
var baseMenor : Float = 2.0
var resultado : Float = Float(0)

resultado = calculaAreaTrapezio(altura: altura, baseMaior: baseMaior, baseMenor: baseMenor)
print("O trapézio de altura \(altura), base maior de tamanho \(baseMaior) e base menor de tamanho \(baseMenor) tem área igual a \(resultado)")
