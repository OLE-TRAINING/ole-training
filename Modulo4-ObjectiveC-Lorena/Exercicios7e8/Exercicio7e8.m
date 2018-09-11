//
//  main.m
//  Exercicios7e8-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Pessoa.h"



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
    printf("Nome: %s\nCPF: %s\nIdade: %i\n\n", nome, cpf, idade);
}
@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Pessoa *pessoa1 = [[Pessoa alloc]initDados:"Maria" idade:35 cpf:"112547895"];
        [pessoa1 imprimeDados];
        Pessoa *pessoa2 = [[Pessoa alloc]initDados:"João" idade:29 cpf:"1954447861"];
        [pessoa2 imprimeDados];
    }
    return 0;
}
