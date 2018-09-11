//
//  CarroCorrida.h
//  Exercicio3-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef CarroCorrida_h
#define CarroCorrida_h

@interface CarroCorrida: NSObject {
    int numeroIdentificacao;
    double velocidadeAtual;
    double velocidadeMaxima;
     Motor *motor;
    Piloto *piloto;
    
}
@property(nonatomic, readwrite) double velocidadeMaxima;
@property(nonatomic, readwrite) double velocidadeAtual;
-(void) acelerar;
@end

#endif /* CarroCorrida_h */
