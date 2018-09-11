//
//  main.m
//  Exercicio6-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "PontoCartesiano.h"
# import "Triangulo.h"

@implementation PontoCartesiano
@synthesize pontoX, pontoY;
-(id)initPonto:(int)pontoX Segundo:(int)pontoY {
    self = [super init];
    self.pontoX = pontoX;
    self.pontoY = pontoY;
    return self;
}
@end

@implementation Triangulo
-(id)initTriangulo {
    self = [super init];
    ponto1 = [[PontoCartesiano alloc]initPonto:10 Segundo:15];
    ponto2 = [[PontoCartesiano alloc]initPonto:5 Segundo:10];
    ponto3 = [[PontoCartesiano alloc]initPonto:15 Segundo:10];
    return self;
}

-(void)imprimeTriangulo {
    printf("Ponto 1: (%i, %i)\nPonto 2: (%i, %i)\nPonto 3: (%i, %i)\n", ponto1.pontoX, ponto1.pontoY, ponto2.pontoX, ponto2.pontoY, ponto3.pontoX, ponto3.pontoY);
}
@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Triangulo *triangulo1 = [[Triangulo alloc]initTriangulo];
        [triangulo1 imprimeTriangulo];
    }
    return 0;
}
