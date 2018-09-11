//
//  Escola.h
//  Exercicio17-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef Escola_h
#define Escola_h
#import "SalaDeAula.h"

@interface Escola : NSObject {
    SalaDeAula *sala;
    NSMutableArray *salas;
    int numeroSalas;
}
@property(nonatomic, readwrite) int numeroSalas;
@property(nonatomic, readwrite) NSMutableArray* salas;
-(BOOL)adicionaSalas:(SalaDeAula*) sala;
-(BOOL)transfereAlunoSala:(Pessoa*)aluno salaSaida:(SalaDeAula*)salaSaida salaEntrada:(SalaDeAula*)salaEntrada;
@end

#endif /* Escola_h */
