//
//  Contador.h
//  Exercicio4-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef Contador_h
#define Contador_h

@interface Contador : NSObject {
    int valorAtual;
    int valorInicial;
}
@property(nonatomic, readwrite) int valorAtual;
@property(nonatomic, readonly) int valorInicial;
-(int)incrementa:(int)incremento;
-(int)decrementa:(int)decremento;
-(int)informaValorInicial;
-(void)imprimeValorAtual;
@end

#endif /* Contador_h */
