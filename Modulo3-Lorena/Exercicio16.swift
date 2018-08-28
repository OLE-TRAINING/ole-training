//
//  main.swift
//  Exercicio16
//
//  Created by Lorena Rodrigues Bruno on 27/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

var array = [20, 3, 45, 12, 24]
var tamanhoVetor = array.count
var arrayOrdenado =  Array(repeating: 0, count: tamanhoVetor)
var maiorElemento = Int(), indexMaiorElemento = Int()
var indexArrayOrdenado = Int()

func encontraMaiorElemento(array: [Int]) {
    maiorElemento = array[0]
    if tamanhoVetor > 2 {
        for indexArray in 0...tamanhoVetor-2{
            if array[indexArray] > array[indexArray+1] && array[indexArray] >= maiorElemento
            {
                maiorElemento = array[indexArray]
                indexMaiorElemento = indexArray
            }
            if indexArray == tamanhoVetor-2 {
                if array[tamanhoVetor-1] >= maiorElemento {
                    maiorElemento = array[tamanhoVetor-1]
                    indexMaiorElemento = tamanhoVetor-1
                }
            }
        }
    } else if tamanhoVetor == 2 {
        if array[0] > array[1] {
            maiorElemento = array[0]
            indexMaiorElemento = 0
            
        } else {
            maiorElemento = array[1]
            indexMaiorElemento = 1
        }
        
    } else if tamanhoVetor == 1 {
        maiorElemento = array[0]
        indexMaiorElemento = 0
    }
}


repeat {
    encontraMaiorElemento(array: array)
    arrayOrdenado[indexArrayOrdenado] = maiorElemento
    array.remove(at: indexMaiorElemento)
    print("maior elemento: \(maiorElemento)")
    tamanhoVetor = array.count
    print("tamanho do array: \(tamanhoVetor)")
    indexArrayOrdenado += 1
    
    
} while tamanhoVetor != 0


print("Array ordenado \(arrayOrdenado[0]) \(arrayOrdenado[1]) \(arrayOrdenado[2]) \(arrayOrdenado[3]) \(arrayOrdenado[4])")

