//
//  main.m
//  Exercicio16-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

int encontraMaiorElemento(NSMutableArray *array ) {
    int maiorElemento = [array[0] intValue];
    NSInteger tamanhoVetor = array.count;
    int indexArray, indexMaiorElemento;
    
    if (tamanhoVetor > 2) {
        for(indexArray=0;indexArray<=tamanhoVetor-2; indexArray++) {
            if (array[indexArray] > array[indexArray+1] && [array[indexArray] intValue] >= maiorElemento)
            {
                maiorElemento = [array[indexArray] intValue];
                indexMaiorElemento = indexArray;
            }
            if (indexArray == tamanhoVetor-2) {
                if ([array[tamanhoVetor-1] intValue] >= maiorElemento) {
                    maiorElemento = [array[tamanhoVetor-1] intValue];
                    indexMaiorElemento = tamanhoVetor - 1;
                }
            }
        }
    } else if (tamanhoVetor == 2 ){
        if (array[0] > array[1]) {
            maiorElemento = [array[0] intValue];
            indexMaiorElemento = 0;
            
        } else {
            maiorElemento = [array[1] intValue];
            indexMaiorElemento = 1;
        }
        
    } else if (tamanhoVetor == 1) {
        maiorElemento = [array[0] intValue];
        indexMaiorElemento = 0;
    }
    return maiorElemento;
}

int encontraIndexMaiorElemento(NSMutableArray *array, int maiorElemento) {
    NSInteger tamanhoVetor = array.count;
    int i, contador;
    for (i=0; i<tamanhoVetor; i++) {
        if([array[i] intValue] == maiorElemento) {
            contador = i;
            return contador;
        }
    }
    return 0;
}


int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int tamanhoVetor, indexMaiorElemento, maiorElemento, indexArrayOrdenado=0;
        NSMutableArray *array = [@[@14, @7, @9, @12, @13]mutableCopy] ;
        //NSMutableArray *arrayOrdenado = [@[@0, @0, @0, @0, @0]mutableCopy] ;
        int arrayOrdenado[] = {0, 0, 0, 0, 0};
        do {
            maiorElemento = encontraMaiorElemento(array);
            indexMaiorElemento = encontraIndexMaiorElemento(array, maiorElemento);
            arrayOrdenado[indexArrayOrdenado] = maiorElemento;
            [array removeObjectAtIndex:indexMaiorElemento];
            tamanhoVetor = array.count;
            indexArrayOrdenado += 1;
        } while (tamanhoVetor != 0);
        
        printf("Array ordenado %i %i %i %i %i\n", arrayOrdenado[0], arrayOrdenado[1], arrayOrdenado[2], arrayOrdenado[3], arrayOrdenado[4]);

    }
    return 0;
}
