//
//  main.m
//  Exercicios14e15
//
//  Created by Lorena Rodrigues Bruno on 11/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Calculadora.h"

@interface CalculadoraComercial: Calculadora {
}
-(double)porcentagem:(double)valor porcentagem:(int)porcentagem;
@end

@implementation CalculadoraComercial
-(double)porcentagem:(double)valor porcentagem:(int)porcentagem {
    printf("%i porcento de %.2lf = %.2lf\n", porcentagem, valor, (double)valor*(porcentagem/100.0));
    return valor*(porcentagem/100.0);
}
@end

@implementation Calculadora
-(double)soma:(double)valor1 segundo:(double)valor2{
    printf("%.2lf+%.2lf = %.2lf\n", valor1, valor2, valor1+valor2);
    return valor1 + valor2;
}
-(double)subtracao:(double)valor1 segundo:(double)valor2{
    printf("%.2lf-%.2lf = %.2lf\n", valor1, valor2, valor1-valor2);
    return valor1-valor2;
}
-(double)multiplicacao:(double)valor1 segundo:(double)valor2{
    printf("%.2lf*%.2lf = %.2lf\n", valor1, valor2, valor1*valor2);
    return valor1*valor2;
}
-(double)divisao:(double)valor1 segundo:(double)valor2{
    printf("%.2lf/%.2lf = %.2lf\n", valor1, valor2, valor1/valor2);
    return valor1/valor2;
}

@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        //Calculadora *calculadora = [[Calculadora alloc] init];
        CalculadoraComercial *calculadoraC = [[CalculadoraComercial alloc]init];
        int opcao, porcentagem=0;
        double valor1=0, valor2=0;
        do {
            printf("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Porcentagem\n6-Sair\n");
            scanf("%i", &opcao);
            if(1 <= opcao && opcao <= 4) {
                printf("Valor 1: \n");
                scanf("%lf", &valor1);
                printf("Valor 2: \n");
                scanf("%lf", &valor2);
            } else if(opcao == 5) {
                printf("Valor 1: \n");
                scanf("%lf", &valor1);
                printf("Porcentagem: \n");
                scanf("%i", &porcentagem);
            }
            switch (opcao) {
                case 1:
                    [calculadoraC soma:valor1 segundo:valor2];
                    break;
                case 2:
                    [calculadoraC subtracao:valor1 segundo:valor2];
                    break;
                case 3:
                    [calculadoraC multiplicacao:valor1 segundo:valor2];
                    break;
                case 4:
                    [calculadoraC divisao:valor1 segundo:valor2];
                    break;
                case 5:
                    [calculadoraC porcentagem:valor1 porcentagem:porcentagem];
                    break;
                default:
                    printf("Opção inválida");
                    break;
            }
        } while (opcao != 6);
        
    }
    return 0;
}
