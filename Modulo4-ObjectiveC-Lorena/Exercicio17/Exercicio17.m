//
//  main.m
//  Exercicio17-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "SalaDeAula.h"
#import "Pessoa.h"
#import "Escola.h"

@implementation Escola
@synthesize numeroSalas, salas;
-(id)init {
    self = [super init];
    numeroSalas = 0;
    salas = [[NSMutableArray alloc] initWithCapacity:20];
    return self;
}

-(BOOL)adicionaSalas:(SalaDeAula *)sala {
    if(numeroSalas < 10) {
        salas[numeroSalas] = sala;
        numeroSalas += 1;
    } else {
        printf("Todas as salas já estão ocupadas.\n");
        return NO;
    }
    return YES;
}


-(BOOL)transfereAlunoSala:(Pessoa*)aluno salaSaida:(SalaDeAula*)salaSaida salaEntrada:(SalaDeAula*)salaEntrada {
    for(int i=0; i<salas.count; i++)
    {
        if(salaSaida == salas[i])
        {
            [salas[i] removeObject:aluno];
        }
        
        if (salaEntrada == salas[i]) {
            [salas[i] adicionaAluno:aluno];
        }
        
    }
    return YES;
}


@end

@implementation SalaDeAula
@synthesize numeroAlunos, alunos;
-(id)init {
    self = [super init];
    numeroAlunos = 0;
    alunos = [[NSMutableArray alloc] initWithCapacity:10];
    return self;
}

-(BOOL)adicionaAluno:(Pessoa*)aluno {
    if(numeroAlunos < 10) {
        alunos[numeroAlunos] = aluno;
        numeroAlunos += 1;
    } else {
        printf("O número de alunos máximo para essa sala foi atingido. Não é possivel adicionar mais alunos.\n");
        return NO;
    }
    return YES;
}
@end

@implementation Pessoa
@synthesize nome, idade, cpf;
-(id)initDados:(char*)nome idade:(int)idade cpf:(char*)cpf {
    self = [super init];
    self.nome = nome;
    self.idade = idade;
    self.cpf = cpf;
    return self;
}

-(void)imprimeDados {
    printf("Nome: %s\nCPF: %s\nIdade: %i\n", nome, cpf, idade);
}
@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
    }
    return 0;
}
