//
//  main.m
//  Exercicio19-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

void calculaQuadradoImpares(NSArray *array) {
    int i, resultadoQuadrado;
    for(i=0; i<array.count; i++) {
        resultadoQuadrado = [[array objectAtIndex:i] intValue]*[[array objectAtIndex:i] intValue];
        printf("O quadrado de %i é %i\n", [[array objectAtIndex:i] intValue], resultadoQuadrado);
    }
    
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSArray *impares = @[@15, @17, @19, @21, @23, @25, @27, @29, @31, @33, @35];
        calculaQuadradoImpares(impares);
    }
    return 0;
}
