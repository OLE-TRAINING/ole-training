//
//  main.m
//  Exercicio16-C
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Pessoa.h"
#import "Conta.h"

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

@implementation Conta
@synthesize cliente, numeroConta, saldo, limite;
-(id)initConta:(char *)numeroConta saldo:(double)saldo limite:(double)limite cliente:(Pessoa *)cliente{
    self = [super init];
    self.numeroConta = numeroConta;
    self.saldo = saldo;
    self.limite = limite;
    self.cliente = cliente;
    return self;
}
-(void)depositar:(int)valorDeposito{
    saldo += valorDeposito;
}
-(BOOL)sacar:(int)valorSaque{
    if(valorSaque > limite || valorSaque > saldo) {
        printf("Você não tem limite/saldo para realizar esta operação\n");
        return NO;
    }
    else {
        saldo -= valorSaque;
        return YES;
    }
}
-(void)mostraSaldo{
    printf("Saldo: %.2lf\n", saldo);
    }

@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Pessoa *cliente1 = [[Pessoa alloc] initDados:"João" idade:45 cpf:"123456789-10"];
        Conta *conta1 = [[Conta alloc] initConta:"12345" saldo:1000.0 limite:5000.0 cliente:cliente1];
        [conta1 sacar:2000.0 ];
        [conta1 depositar:3000.0];
        [conta1 mostraSaldo];
        
        
    }
    return 0;
}
