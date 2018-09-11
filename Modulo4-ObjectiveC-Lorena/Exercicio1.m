//
//  main.m
//  Exercicio1-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface CarroCorrida: NSObject {
    int numeroIdentificacao;
    double velocidadeAtual;
    double velocidadeMaxima;
}
@property(nonatomic, readwrite) double velocidadeMaxima;

@end

@implementation CarroCorrida
@synthesize velocidadeMaxima;
-(id)initWithVelocidade : (double)velocidadeMaxima {
    self = [super init];
    self.velocidadeMaxima = velocidadeMaxima;
    return self;
}
@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        CarroCorrida *carro1 = [[CarroCorrida alloc]initWithVelocidade:160];
        printf("Velocidade máxima: %2.f\n", carro1.velocidadeMaxima);
    }
    return 0;
}
