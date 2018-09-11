//
//  Endereco.h
//  Exercicios10a13-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef Endereco_h
#define Endereco_h

@interface Endereco: NSObject {
    char *estado;
    char *cidade;
    char *bairro;
    char *rua;
    char *cep;
    char *telefone;
}
@property(nonatomic, readwrite) char *estado;
@property(nonatomic, readwrite) char *cidade;
@property(nonatomic, readwrite) char *bairro;
@property(nonatomic, readwrite) char *rua;
@property(nonatomic, readwrite) char *cep;
@property(nonatomic, readwrite) char *telefone;
-(void)imprimeEndereco;
@end

#endif /* Endereco_h */
