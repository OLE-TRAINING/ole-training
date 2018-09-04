//
//  main.swift
//  Exercicio20
//
//  Created by Lorena Rodrigues Bruno on 24/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

//for linha in 1...8 {
//    for coluna in 1...8 {
//        print("*", terminator: "")
//    }
//    print("\n")
//
//}

func figura1() {
    for contador in 1...8 {
        for coluna in 1...8 {
            if coluna <= contador {
                print("*", terminator:"")
            } else {
                print(" ", terminator:"")
            }
        }
        print("\n")
    }
}

func figura2() {
    for contador in stride(from: 8, to: 0, by: -1) {
        for coluna in 1...8{
            
            if coluna <= contador {
                print("*", terminator:"")
            } else {
                print(" ", terminator:"")
            }
        }
        print("\n")
    }
}

func figura3(){
    for contador in 1...8 {
        for coluna in 1...8 {
            if coluna > contador {
                print("*", terminator:"")
            } else {
                print(" ", terminator:"")
            }
        }
        print("\n")
    }
}

func figura4() {
    for contador in stride(from: 8, to: 0, by: -1) {
        for coluna in 1...8{
            
            if coluna > contador {
                print("*", terminator:"")
            } else {
                print(" ", terminator:"")
            }
        }
        print("\n")
    }
}

figura1()
print("\n")
figura2()
print("\n")
figura3()
print("\n")
figura4()
print("\n")


