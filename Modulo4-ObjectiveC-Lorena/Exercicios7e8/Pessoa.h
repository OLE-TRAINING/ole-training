//
//  Pessoa.h
//  Exercicios7e8-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef Pessoa_h
#define Pessoa_h

@interface Pessoa: NSObject {
    char *nome;
    int idade;
    char *cpf;
}
@property(nonatomic, readwrite) char *nome;
@property(nonatomic, readwrite) int idade;
@property(nonatomic, readwrite) char *cpf;
-(void)imprimeDados;
@end

#endif /* Pessoa_h */
