//
//  main.swift
//  Exercicios7e8
//
//  Created by Lorena Rodrigues Bruno on 04/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

//Exercicio 7
var novoSet : Set = [100, 20, 200, 30, 80, 40, 100, 200]

var media = 0.0
novoSet.forEach { elemento in
    media += Double(elemento)
}
media /= Double(novoSet.count)
print("A média dos elementos é: \(media)")

//Exercicio 8
//As médias encontradas nos exercícios 6 e 7 ficaram diferentes pois a coleção do tipo Set não permite elementos repetidos, eliminando-os de sua base
