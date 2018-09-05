//
//  main.swift
//  Exercicios2a4
//
//  Created by Lorena Rodrigues Bruno on 04/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

//Exericio2
var novoArray = ["String 1", "String 1" , "String 2", "String 2", "String 3", "String 3"]
for elemento in novoArray {
    print("\(elemento)")
}
print("A coleção tem \(novoArray.count) elementos")


//Exercicios 3 - em swift, HashSet pode ser representado por Set
var novoSet: Set = ["String 1", "String 1" , "String 2", "String 2", "String 3", "String 3"]
for elemento in novoSet {
    print("\(elemento)")
}
print("A coleção tem \(novoSet.count) elementos")


//Exercicio 4 - em swift, HashSet pode ser representado por Dictionary
var novoDictionary = [1: "String 1", 2: "String 1" , 3: "String 2", 4: "String 2", 5: "String 3", 6: "String 3"]
for (key, value) in novoDictionary {
    print("\(key): \(value)")
}
print("A coleção tem \(novoDictionary.count) elementos")

