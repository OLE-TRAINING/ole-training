//
//  main.m
//  Exercicios10a13-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Pessoa.h"
#import "Endereco.h"
#import "CadastroPessoal.h"

@implementation Endereco
@synthesize estado, cidade, bairro, rua, cep, telefone;
-(void)imprimeEndereco {
    printf("Endereço:\nRua/Avenida %s - %s\nCEP: %s\n%s - %s\n\n", rua, bairro, cep, cidade, estado);
}
@end

@implementation Pessoa
@synthesize nome, idade, cpf, endereco;
-(id)initDados:(char*)nome idade:(int)idade cpf:(char*)cpf {
    self = [super init];
    self.nome = nome;
    self.idade = idade;
    self.cpf = cpf;
    endereco = [[Endereco alloc]init];
    return self;
}

-(void)imprimeDados {
    printf("Nome: %s\nCPF: %s\nIdade: %i\n", nome, cpf, idade);
    [endereco imprimeEndereco];
}
@end

@implementation CadastroPessoal
@synthesize numeroCadastros, cadastro;
-(id)init {
    self = [super init];
    cadastro = [[NSMutableArray alloc] initWithCapacity:100];
    return self;
}
-(BOOL)adicionaPessoa:(Pessoa*) pessoa {
    if(numeroCadastros < 100) {
        cadastro[numeroCadastros] = pessoa;
        numeroCadastros += 1;
    } else {
        printf("Número de cadastros máximo atingido!\n");
        return NO;
    }
    return YES;
}

-(BOOL)removePessoa:(Pessoa*) pessoa {
    [cadastro removeObject:pessoa];
    return YES;
}

-(void)imprimeCadastros {
    for (int i=0; i<cadastro.count; i++) {
        [cadastro[i] imprimeDados];
    }
}

@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Endereco *endereco1 = [[Endereco alloc] init];
        endereco1.estado = "Minas Gerais";
        endereco1.cidade = "Uberlandia";
        endereco1.bairro = "Centro";
        endereco1.rua = "Avenida Floriano Peixoto";
        endereco1.cep = "38459871";
        Pessoa *pessoa1 = [[Pessoa alloc]initDados:"Maria" idade:32 cpf:"123456789-10"];
        pessoa1.endereco = endereco1;
        Pessoa *pessoa2 = [[Pessoa alloc]initDados:"João" idade:15 cpf:"00011122-15"];
        pessoa2.endereco = endereco1;
        Pessoa *pessoa3 = [[Pessoa alloc]initDados:"José" idade:27 cpf:"987654321-00"];
        pessoa3.endereco = endereco1;
        
        
        CadastroPessoal *cadastro1 = [[CadastroPessoal alloc]init];
        [cadastro1 adicionaPessoa:pessoa1];
        [cadastro1 adicionaPessoa:pessoa2];
        [cadastro1 adicionaPessoa:pessoa3];
        //[cadastro1 imprimeCadastros];
        [cadastro1 removePessoa:pessoa2];
        //[cadastro1 imprimeCadastros];
    }
    return 0;
}

