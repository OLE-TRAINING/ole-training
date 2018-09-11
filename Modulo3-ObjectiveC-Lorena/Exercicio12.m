//
//  main.m
//  Exercicio12-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

void transporMatriz (int matriz[4][4], int matrizTransposta[4][4]) {
    int linha, coluna;
    for(linha=0; linha < 4; linha++) {
        for(coluna=0; coluna < 4; coluna++) {
            if (linha == coluna)
                matrizTransposta[linha][coluna] = matriz[linha][coluna];
            else
                matrizTransposta[linha][coluna] = matriz[coluna][linha];
        }
    }
}

void imprimeMatriz (int matriz[4][4]) {
    int linha, coluna;
    
    for(linha=0; linha < 4; linha++){
        for(coluna=0; coluna < 4; coluna++) {
            printf("%i ", matriz[linha][coluna]);
        }
        printf("\n");
    }
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int matriz[4][4], matrizTransposta[4][4], linha, coluna, entrada;
        
        printf("Digite 16 valores: ");
        for(linha=0; linha<4; linha++) {
            for(coluna=0; coluna<4; coluna++)
            {
                scanf("%i", &entrada);
                matriz[linha][coluna] = entrada;
            }
        }
        
        transporMatriz(matriz, matrizTransposta);
        printf("Matriz: \n");
        imprimeMatriz(matriz);
        
        printf("Matriz transposta: \n");
        imprimeMatriz(matrizTransposta);
    }
    return 0;
}
