//
//  main.m
//  Exercicio5-C
//
//  Created by Lorena Rodrigues Bruno on 05/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int mes;
       
        do{
            printf("Digite um número de 1 a 12: \n*Para sair, digite 0\n");
            scanf("%i", &mes);
            switch (mes) {
            case 1:
                NSLog(@"Janeiro");
                break;
            case 2:
                NSLog(@"Fevereiro");
                break;
            case 3:
                NSLog(@"Março");
                break;
            case 4:
                NSLog(@"Abril");
                break;
            case 5:
                NSLog(@"Maio");
                break;
            case 6:
                NSLog(@"Junho");
                break;
            case 7:
                NSLog(@"Julho");
                break;
            case 8:
                NSLog(@"Agosto");
                break;
            case 9:
                NSLog(@"Setembro");
                break;
            case 10:
                NSLog(@"Outubro");
                break;
            case 11:
                NSLog(@"Novembro");
                break;
            case 12:
                NSLog(@"Dezembro");
                break;
            default:
                NSLog(@"Mês inválido");
                break;
            }
            
        } while (mes != 0);
    }
    
    return 0;
}
