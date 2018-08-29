//
//  main.swift
//  Exercicio5
//
//  Created by Lorena Rodrigues Bruno on 23/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

var mes : String! = String()

repeat{
    print("Digite um número de 1 a 12: \n*Para sair, digite 0")
    mes = readLine()
    switch mes {
    case "1":
        print("Janeiro\n")
    case "2":
        print("Fevereiro\n")
    case "3":
        print("Março\n")
    case "4":
        print("Abril\n")
    case "5":
        print("Maio\n")
    case "6":
        print("Junho\n")
    case "7":
        print("Julho\n")
    case "8":
        print("Agosto\n")
    case "9":
        print("Setembro\n")
    case "10":
        print("Outubro\n")
    case "11":
        print("Novembro\n")
    case "12":
        print("Dezembro\n")
    default:
        print("Mês inválido\n")
    }
    
} while mes != "0"
