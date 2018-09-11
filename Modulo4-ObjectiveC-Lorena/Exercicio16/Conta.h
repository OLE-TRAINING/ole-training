//
//  Conta.h
//  Exercicio16-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef Conta_h
#define Conta_h

@interface Conta: NSObject {
    Pessoa *cliente;
    char *numeroConta;
    double saldo;
    double limite;
}
@property(nonatomic, readwrite) Pessoa *cliente;
@property(nonatomic, readwrite) char *numeroConta;
@property(nonatomic, readwrite) double saldo;
@property(nonatomic, readwrite) double limite;
-(void)depositar:(int)valorDeposito;
-(BOOL)sacar:(int)valorSaque;
-(void)mostraSaldo;
-(id)initConta:(char *)numeroConta saldo:(double)saldo limite:(double)limite cliente:(Pessoa *)cliente;

@end

#endif /* Conta_h */
