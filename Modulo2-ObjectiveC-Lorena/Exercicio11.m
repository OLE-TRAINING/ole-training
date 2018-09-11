//
//  main.m
//  Exercicio11-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        float salarioIntegral, salarioProporcional;
        int diasTrabalhados;
        printf("Digite o valor integral do salário: ");
        scanf("%.2f", &salarioIntegral);
        printf("Digite o número de dias trabalhados: ");
        scanf("%i", &diasTrabalhados);
        
        salarioProporcional = (salarioIntegral/22.0) * diasTrabalhados;
        printf("O salário do funcionário esse mês será de: %.2f\n", salarioProporcional);
        
    }
    return 0;
}
