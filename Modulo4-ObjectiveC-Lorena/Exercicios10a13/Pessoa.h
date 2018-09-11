//
//  Pessoa.h
//  Exercicios10a13-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef Pessoa_h
#define Pessoa_h
#import "Endereco.h"

@interface Pessoa: NSObject {
    char *nome;
    int idade;
    char *cpf;
    Endereco *endereco;
}
@property(nonatomic, readwrite) char *nome;
@property(nonatomic, readwrite) int idade;
@property(nonatomic, readwrite) char *cpf;
@property(nonatomic, readwrite) Endereco *endereco;
-(void)imprimeDados;
@end

#endif /* Pessoa_h */
