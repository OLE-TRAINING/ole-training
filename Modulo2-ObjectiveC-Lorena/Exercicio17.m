//
//  main.m
//  Exercicio17-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

float calculaAreaTrapezio (float altura, float baseMaior, float baseMenor) {
    return ((baseMaior + baseMenor)* altura) /2.0;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        float altura = 1.5, baseMaior = 3.0, baseMenor = 2.0, resultado;
        resultado = calculaAreaTrapezio(altura, baseMaior, baseMenor);
        printf("O trapézio de altura %.2f, base maior de tamanho %.2f e base menor de tamanho %.2f tem área igual a %.2f\n", altura, baseMaior, baseMenor, resultado);
    }
    return 0;
}
