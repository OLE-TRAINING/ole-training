//
//  main.m
//  Exercicio7-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

void somaImpares(NSArray *arrayImpares) {
    int i, soma = 0;
    for(i = 0; i < arrayImpares.count ; i++) {
        soma = soma + [[arrayImpares objectAtIndex:i] intValue];
    }
    printf("A soma dos números ímpares de 1 a 30 é: %i\n", soma);
}

void multiplicaPares(NSArray *arrayPares){
    long multiplicacao = 1;
    int i;
    for (i=0; i < arrayPares.count ; i++) {
        multiplicacao = multiplicacao * [[arrayPares objectAtIndex:i] intValue];
    }
    printf("A multiplicação dos números pares de 1 a 30 é: %lu\n", multiplicacao);
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSArray *impares = @[@1, @3, @5, @7, @9, @11, @13, @15, @17, @19, @21, @23, @25, @27, @29];
        NSArray *pares = @[@2, @4, @6, @8, @10, @12, @14, @16, @18, @20, @22, @24, @26, @28, @30];
        
        somaImpares(impares);
        multiplicaPares(pares);
        
    }
    
    return 0;
}
