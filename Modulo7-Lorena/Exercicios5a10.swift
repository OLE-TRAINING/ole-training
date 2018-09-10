//
//  main.swift
//  Exercicios5a10
//
//  Created by Lorena Rodrigues Bruno on 30/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Funcionario {
    var nome = String()
    var codigoFuncional = String()
    var comissao = Double()
    
    func renda() -> Double {
        return 1000
    }
    
    func calculaComissao() -> Double {
        return comissao
    }
    
}

class FuncionarioEnsinoBasico: Funcionario{
    var escolaEnsinoBasico = String()
    
    override func renda() -> Double {
        return 1.1 * super.renda()
    }
}

class FuncionarioEnsinoMedio: FuncionarioEnsinoBasico {
    var escolaEnsioMedio = String()
    
    override func renda() -> Double {
        return 1.5 * super.renda()
    }
}

class FuncionarioGraduado: FuncionarioEnsinoMedio {
    var universidade = String()
    
    override func renda() -> Double {
        return 2.0 * super.renda()
    }
}


class Empresa {
    var quadroFuncionarios : [Funcionario] = Array(repeating: Funcionario(), count: 10)
    var salarioEnsinoBasico = Double()
    var salarioEnsinoMedio = Double()
    var salarioGraduado = Double()
    
    func contrataFuncionarios() {
        for index in 0...3 {
            quadroFuncionarios[index] = FuncionarioEnsinoBasico()
        }
        for index in 4...7 {
            quadroFuncionarios[index] = FuncionarioEnsinoMedio()
        }
        for index in 8...9 {
            quadroFuncionarios[index] = FuncionarioGraduado()
        }
    }
    
    func adicionaComissao() {
        for index in 0...6 {
            quadroFuncionarios[index].comissao = Vendedor().calculaComissao()
        }
        for index in 7...8 {
            quadroFuncionarios[index].comissao = Supervisor().calculaComissao()
        }
        quadroFuncionarios[9].comissao = Gerente().calculaComissao()
        
    }
    
    func calculaCustoTotal() -> Double  {
        var totalSalarios = Double()
        for funcionario in quadroFuncionarios {
            totalSalarios += funcionario.renda() + funcionario.calculaComissao()
        }
        return totalSalarios
    }
    
    func calculaCustoPorClasse() {
        
        
        for index in 0...3 {
            salarioEnsinoBasico += quadroFuncionarios[index].renda() + quadroFuncionarios[index].calculaComissao()
        }
        for index in 4...7 {
            salarioEnsinoMedio += quadroFuncionarios[index].renda() + quadroFuncionarios[index].calculaComissao()
        }
        for index in 8...9 {
            salarioGraduado += quadroFuncionarios[index].renda() + quadroFuncionarios[index].calculaComissao()
        }
        
    }
    
}


class Comissao {
    func calculaComissao() -> Double{
        return  0.0
    }
}

class Vendedor: Comissao {
    override func calculaComissao() -> Double{
        return 250.0
    }
}

class Supervisor: Comissao {
    override func calculaComissao() -> Double{
        return 600.0
    }
}

class Gerente: Comissao  {
    override func calculaComissao() -> Double{
        return 1500.0
    }
}


////testes
//var funcionario1 = Funcionario()
//funcionario1.nome = "João"
//print("Salario de \(funcionario1.nome): \(funcionario1.renda())")
//
//var funcionario2 = FuncionarioEnsinoBasico()
//funcionario2.nome = "Maria"
//funcionario2.comissao = Vendedor().calculaComissao()
//print("Salario de \(funcionario2.nome): \(funcionario2.renda())")
//
//var funcionario3 = FuncionarioEnsinoMedio()
//funcionario3.nome = "Pedro"
//funcionario3.comissao = Supervisor().calculaComissao()
//print("Salario de \(funcionario3.nome): \(funcionario3.renda())")
//
//var funcionario4 = FuncionarioGraduado()
//funcionario4.nome = "Ana"
//funcionario4.comissao = Gerente().calculaComissao()
//print("Salario de \(funcionario4.nome): \(funcionario4.renda())")

////Programa
//var empresaX = Empresa()
//empresaX.contrataFuncionarios()
//empresaX.adicionaComissao()
//var salariosTotal = empresaX.calculaCustoTotal()
//print("Custo da empresa com salários totais: \(salariosTotal)")
//empresaX.calculaCustoPorClasse()
//print("Custos da empresa com salários por nível de escolaridade:\nEnsino Básico concluído: \(empresaX.salarioEnsinoBasico)\nEnsino Médio concluído: \(empresaX.salarioEnsinoMedio)\nGraduação concluída: \(empresaX.salarioGraduado)")



