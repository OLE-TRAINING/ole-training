//
//  main.m
//  Exercicio4-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Contador.h"

@implementation Contador
@synthesize valorAtual, valorInicial;
-(id)initValor : (int) valor {
    self = [super init];
    valorInicial = valor;
    valorAtual = valorInicial;
    return self;
}


-(int)incrementa:(int)incremento {
    return valorAtual += incremento;
}

-(int)decrementa:(int)decremento {
    return valorAtual -= decremento;
}

-(int)informaValorInicial {
    return valorInicial;
}
-(void)imprimeValorAtual {
    printf("Valor Atual: %i\n", valorAtual);
}

@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Contador *contador = [[Contador alloc] initValor: 15];
        [contador incrementa:10];
        [contador decrementa:7];
        printf("Valor Inicial: %i\n", [contador valorInicial]);
        [contador imprimeValorAtual];
        
    }
    return 0;
}
