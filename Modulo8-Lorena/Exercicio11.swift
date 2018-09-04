//
//  ViewController.swift
//  Exercicio11
//
//  Created by Lorena Rodrigues Bruno on 03/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

import UIKit

enum Erro: Error  {
    case invalidaValue
    
}

protocol FiguraGeometrica {
    func calcularArea() -> Double
    func calcularPerimetro() -> Double
}

class Quadrilatero : FiguraGeometrica{
    var lado1=0.0, lado2=0.0, lado3=0.0, lado4=0.0
    init(lado1:Double, lado2:Double, lado3: Double, lado4:Double) {
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
        self.lado4 = lado4
    }
    
    func calcularPerimetro() -> Double {
        return lado1 + lado2 + lado3 + lado4
    }
    
    func calcularArea() -> Double {
        return lado1 * lado3
    }
}

class Quadrado: Quadrilatero {
    
    init(lado: Double) throws {
        if lado <= 0 {
            throw Erro.invalidaValue
        } else {
            super.init(lado1: lado, lado2: lado, lado3: lado, lado4: lado)
        }
        
    }
}

class ViewController: UIViewController {

    @IBOutlet weak var areaTextfield: UITextField!
    
    @IBOutlet weak var perimetro: UILabel!
    
    @IBOutlet weak var area: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    
    
    @IBAction func calcula(_ sender: Any) {
        
        
        do {
            let quadrado = try Quadrado(lado: Double(areaTextfield.text!)!)
            perimetro.text = "Perímetro do quadrado: \(String(quadrado.calcularPerimetro()))"
            area.text = "Area do quadrado: \(String(quadrado.calcularArea()))"
        } catch {
            alerta()
        }
        
    }
    
    func alerta() {
        let alertController = UIAlertController(title: "Alerta", message: "Valor inválido, o valor esperado é maior que 0 (zero)", preferredStyle: .alert)
        let actionOK = UIAlertAction(title: "OK", style: .default) { (_ action: UIAlertAction) in
            //
        }
        alertController.addAction(actionOK)
        self.present(alertController, animated: true, completion: nil)
    }
    
    
}

