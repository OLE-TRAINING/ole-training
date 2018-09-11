//
//  SalaDeAula.h
//  Exercicio17-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef SalaDeAula_h
#define SalaDeAula_h
#import "Pessoa.h"

@interface SalaDeAula:NSObject {
    NSMutableArray *alunos;
    int numeroAlunos;
}
@property(nonatomic, readwrite) int numeroAlunos;
@property(nonatomic, readwrite) NSMutableArray* alunos;
-(BOOL)adicionaAluno:(Pessoa*) aluno;
@end

#endif /* SalaDeAula_h */
