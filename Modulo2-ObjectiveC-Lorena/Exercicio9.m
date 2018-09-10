//
//  main.m
//  Exercicio9-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int numero;
        
        printf("Digite um número inteiro de no máximo 4 dígitos: \n");
        scanf("%i", &numero);
        
        int digitos[] = {0, 0, 0, 0};
        
        digitos[0] = numero/1000;
        digitos[1] = numero/100;
        digitos[2] = numero/10;
        digitos[3] = numero;
        
        digitos[3] = digitos[3] - (digitos[2]*10);
        digitos[2] = digitos[2] - (digitos[1]*10);
        digitos[1] = digitos[1] - (digitos[0]*10);
        
        printf("O numero %i invertido é: %i%i%i%i\n", numero, digitos[3], digitos[2], digitos[1], digitos[0]);

    }
    return 0;
}
