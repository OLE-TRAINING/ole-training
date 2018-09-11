//
//  main.m
//  Exercicio9-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "SalaDeAula.h"
#import <stdio.h>

@implementation SalaDeAula
@synthesize numeroAlunos, nomeAluno;
-(id)init {
    self = [super init];
    numeroAlunos = 0;
    nomeAluno = [[NSMutableArray alloc] initWithCapacity:10];
    return self;
}

-(BOOL)adicionaAluno:(NSString*)nome {
    if(numeroAlunos < 10) {
        nomeAluno[numeroAlunos] = nome;
        numeroAlunos += 1;
    } else {
        printf("O número de alunos máximo para essa sala foi atingido. Não é possivel adicionar mais alunos.\n");
        return NO;
    }
    return YES;
}
@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        char entrada [20] ;
        BOOL flag = YES;
        NSString *nome;
        SalaDeAula *sala1 = [[SalaDeAula alloc]init];
        
        while(flag == YES) {
            printf("Digite o nome do aluno a ser adicionado à sala:\n");
            fgets(entrada, sizeof entrada, stdin);
            nome = @(entrada);
            flag = [sala1 adicionaAluno:nome];
        }

        printf("Numero de alunos:%i\n", [sala1 numeroAlunos]);
        
    }
    return 0;
}
