//
//  main.swift
//  Exercicio12
//
//  Created by Lorena Rodrigues Bruno on 27/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

var entrada : String? = String()
var matrizEntrada = [[Int]](repeating: [Int](repeating: 0, count: 4), count: 4)
var matrizTransposta = [[Int]](repeating: [Int](repeating: 0, count: 4), count: 4)
var tamanhoMatriz = matrizEntrada.count

func transporMatriz (matriz:[[Int]]) {
    for row in 0..<tamanhoMatriz {
        for column in 0..<tamanhoMatriz{
            if row == column {
                matrizTransposta[row][column] = matrizEntrada[row][column]
            } else {
                matrizTransposta[row][column] = matrizEntrada[column][row]
            }
        }
    }
    
    print("Matriz transposta: \n\(matrizTransposta)")
}


print("Digite 16 valores: ")


for row in 0..<tamanhoMatriz {
    for column in 0..<tamanhoMatriz{
        let aux : Int? = Int(readLine()!)
        matrizEntrada[row][column] = aux!
    }
}

print("\n\(matrizEntrada)\n")

transporMatriz(matriz: matrizEntrada)







