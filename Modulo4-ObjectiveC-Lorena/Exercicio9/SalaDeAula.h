//
//  SalaDeAula.h
//  Exercicio9-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef SalaDeAula_h
#define SalaDeAula_h

@interface SalaDeAula:NSObject {
    NSMutableArray *nomeAluno;
    int numeroAlunos;
}
@property(nonatomic, readwrite) int numeroAlunos;
@property(nonatomic, readwrite) NSMutableArray* nomeAluno;
-(BOOL)adicionaAluno:(NSString*) nome;
@end

#endif /* SalaDeAula_h */
