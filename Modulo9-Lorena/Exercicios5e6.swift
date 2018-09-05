//
//  main.swift
//  Exercicios5e6
//
//  Created by Lorena Rodrigues Bruno on 04/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation
var list = [Int]()

list.append(100)
list.append(20)
list.append(200)
list.append(30)
list.append(80)
list.append(40)
list.append(100)
list.append(200)

var media = 0.0

//Exercicio 5
list.forEach { elemento in
    media += Double(elemento)
}
media /= Double(list.count)
print("A média dos elementos é: \(media)")


//Exercicio 6
media = 0.0
var listIterator = list.makeIterator()
while let elemento = listIterator.next() {
    media += Double(elemento)
}
media /= Double(list.count)
print("A média dos elementos é: \(media)")

