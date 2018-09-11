//
//  CadastroPessoal.h
//  Exercicios10a13-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef CadastroPessoal_h
#define CadastroPessoal_h
#import "Pessoa.h"

@interface CadastroPessoal:NSObject {
    NSMutableArray *cadastro;
    int numeroCadastros;
}
@property(nonatomic, readwrite) int numeroCadastros;
@property(nonatomic, readwrite) NSMutableArray* cadastro;
-(BOOL)adicionaPessoa:(Pessoa*) pessoa;
@end

#endif /* CadastroPessoal_h */
