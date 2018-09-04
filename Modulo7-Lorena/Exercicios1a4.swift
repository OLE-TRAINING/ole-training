//
//  main.swift
//  Exercicios1a4
//
//  Created by Lorena Rodrigues Bruno on 29/08/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

class Animal {
    var nome = String()
    var idade = Int()
    func emiteSom() {
        print("Todo animal emite um som")
    }
    
   
}

class Cachorro : Animal {
    
    override func emiteSom() {
        print("Au Au Au")
        corre()
    }
    
    func corre() {
        print("O cavalo pode correr")
    }
}

class Cavalo: Animal {
    
    override func emiteSom() {
        print("Pocoto pocoto")
        corre()
    }
    
    func corre() {
        print("O cavalo pode correr")
    }
}

class Preguica: Animal {
    
    override func emiteSom() {
        print("AAAAA")
    }
    
    func sobeEmArvore() {
        print("O Preguiça pode subir em arvores!")
    }
}

class Vaca: Animal {
    
    override func emiteSom()  {
        print("Mu Mu Mu")
        corre()
        
    }
    
        func corre() {
            print("A vaca pode correr")
        }
    
}

class Porco: Animal {
    
    override func emiteSom(){
        print("Ronc Ronc Ronc")
        corre()
    }
    
    func corre() {
        print("O porco pode correr")
    }
    
}

class Galo : Animal{
    override func emiteSom(){
        print("CoCoRiCo")
        corre()
    }
    
    func corre() {
        print("O galo pode correr")
    }
}

class Foca : Animal {
    override func emiteSom(){
        print("Ont Ont Ont")
    }
    
    func nadar() {
        print("A foca pode nadar")
    }
    
}

class Golfinho: Animal {
    override func emiteSom(){
        print("Ih Ih Ih")
    }
    
    func nadar() {
        print("O golfinho pode nadar")
    }
}

class Passarinho: Animal {
    override func emiteSom(){
        print("Pi Pi Pi")
    }
    
    func voar() {
        print("O passarinho pode voar")
    }
}

class Periquito : Animal {
    override func emiteSom(){
        print("Olá")
    }
    
    func voar() {
        print("O periquito pode voar")
    }
}


class Veterinario  {
    func examinar(animal : Animal) {
        print("Examinando animal:", terminator: "")
        animal.emiteSom()
    }
}

class Zoologico {
    var jaula : [Animal] = Array(repeating: Animal(), count: 10)
    
    var cachorro = Cachorro()
    var porco = Porco()
    var preguica = Preguica()
    var vaca = Vaca()
    var cavalo = Cavalo()
    var galo =   Galo()
    var foca = Foca()
    var golfinho = Golfinho()
    var passarinho = Passarinho()
    var periquito = Periquito()
    
    
    func colocaAnimaisNasJaulas()
    {
        jaula[0] = cachorro
        jaula[1] = porco
        jaula[2] = preguica
        jaula[3] = vaca
        jaula[4] = cavalo
        jaula[5] = galo
        jaula[6] = foca
        jaula[7] = golfinho
        jaula[8] = passarinho
        jaula[9] = periquito
    }
    
    func percorreJaulas() {
        for animal in jaula {
            animal.emiteSom()
            
            
        }
    }
    
}

////Exercicio 2
//var cachorro = Cachorro()
//cachorro.nome = "Rex"
//cachorro.idade = 2
//print("\(cachorro.nome): ", terminator: "")
//cachorro.emiteSom()
//
//var cavalo = Cavalo()
//cavalo.nome = "Estrela"
//cavalo.idade = 5
//print("\(cavalo.nome): ", terminator: "")
//cavalo.emiteSom()
//
//var preguica = Preguica()
//preguica.nome = "Luna"
//preguica.idade = 3
//print("\(preguica.nome): ", terminator: "")
//preguica.emiteSom()
//
////Exericio3
//var veterinario = Veterinario()
//veterinario.examinar(animal : cachorro)
//veterinario.examinar(animal : cavalo)
//veterinario.examinar(animal : preguica)

////Exercicio4
//var zoo = Zoologico()
//zoo.colocaAnimaisNasJaulas()
//zoo.percorreJaulas()


