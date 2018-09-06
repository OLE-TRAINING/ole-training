//
//  main.m
//  Exercicio10-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int numero, i;
        printf("Digite um número:");
        scanf("%i", &numero);
        
        for(i=2; i< numero; i++) {
            if(numero % i == 0) {
                printf("O número %i não é primo\n", numero);
                break;
            }
            if(i == numero-1) {
                printf("O número %i é primo\n", numero);
            }
        }
    }
    return 0;
}
