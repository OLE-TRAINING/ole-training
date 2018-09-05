//
//  main.swift
//  FinalTest
//
//  Created by Lorena Rodrigues Bruno on 04/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import Foundation

enum CompassPoint : String {
    case N = "N"
    case S = "S"
    case E = "E"
    case W = "W"
}

class RoverPosition {
    var coordinateX = Int()
    var coordinateY = Int()
    var plateauUp = Int()
    var plateauRight = Int()
    var location = CompassPoint.N
    
    init(plateauUp: Int, plateauRight: Int , coordinateX: Int, coordinateY: Int, location: CompassPoint) {
        self.coordinateX = coordinateX
        self.coordinateY = coordinateY
        self.plateauUp = plateauUp
        self.plateauRight = plateauRight
        self.location = location
    }
    
    func spin90Right() {
        switch location {
        case .N:
            location = .E
        case .E:
            location = .S
        case .S:
            location = .W
        case .W:
            location = .N
            
        }
    }
    func spin90Left() {
        switch location {
        case .N:
            location = .W
        case .W:
            location = .S
        case .S:
            location = .E
        case .E:
            location = .N
            
        }
    }
    func move() {
        switch location {
        case .N:
            if plateauUp >= (coordinateY + 1) {
                coordinateY += 1
            }
        case .W:
            if (coordinateX - 1) >= 0 {
                coordinateX -= 1
            }
        case .S:
            if (coordinateY - 1) >= 0 {
                coordinateY -= 1
            }
        case .E:
            if plateauRight >= (coordinateX + 1) {
                coordinateX += 1
            }
        }
    }
    
    func command(orientation : Character) {
        print(orientation, terminator: "")
        switch orientation {
        case "L":
            spin90Left()
        case "R":
            spin90Right()
        case "M":
            move()
        default:
            print("Comando inválido")
        }
        
    }
    
}


//teste
var rover = RoverPosition( plateauUp: 5, plateauRight: 5, coordinateX: 1, coordinateY: 2, location: .N)

print("\(rover.plateauUp) \(rover.plateauRight)")
print("\(rover.coordinateX) \(rover.coordinateY) \(rover.location.rawValue)")
rover.command(orientation: "L")
rover.command(orientation: "M")
rover.command(orientation: "L")
rover.command(orientation: "M")
rover.command(orientation: "L")
rover.command(orientation: "M")
rover.command(orientation: "L")
rover.command(orientation: "M")
rover.command(orientation: "M")
print("\nFinal position: \(rover.coordinateX) \(rover.coordinateY) \(rover.location.rawValue)")






