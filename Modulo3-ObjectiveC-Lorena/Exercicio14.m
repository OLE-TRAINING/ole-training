//
//  main.m
//  Exercicio14-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    // não foi utilizada a classe Scanner para resolver o exercício
    @autoreleasepool {
        int progressaoAritmetica[] = {0,0,0,0,0,0,0,0,0,0};
        int contador, index, constante;
        
        printf("Digite uma sequencia de 10 números: \n");
        for (contador=0; contador<10; contador++) {
            scanf("%i", &progressaoAritmetica[contador]);
        }
        
        constante = progressaoAritmetica[1] - progressaoAritmetica[0];
        
        for (index=0; index<9; index++) {
            if(progressaoAritmetica[index+1] - progressaoAritmetica[index] != constante) {
                printf("Essa sequencia não é uma Progressão Aritmética!\n");
                break;
            }
            
            if (index == 8) {
                printf("Essa sequencia é uma Progressão Aritmética\n");
            }
        }
        
    }
    return 0;
}
