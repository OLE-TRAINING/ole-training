//
//  main.m
//  Exercicio3-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "Motor.h"
#import "Piloto.h"
#import "CarroCorrida.h"

@implementation Piloto
@synthesize habilidade;
-(id)initWithHabilidade : (int)habilidade {
    self = [super init];
    self.habilidade = habilidade;
    return self;
}
@end


@implementation Motor
@synthesize potencia;
-(id) initWithPotencia : (int)potencia {
    self = [super init];
    if (potencia < 0) {
        self.potencia = 0;
    } else if (potencia > 100){
        self.potencia = 100;
    } else {
        self.potencia = potencia;
    }
    return self;
}
@end


@implementation CarroCorrida
@synthesize velocidadeMaxima, velocidadeAtual;
-(id)initWithVelocidade : (double)velocidadeMaxima {
    self = [super init];
    motor = [[Motor alloc]initWithPotencia:7];
    piloto = [[Piloto alloc]initWithHabilidade:5];
    self.velocidadeMaxima = velocidadeMaxima;
    return self;
}

-(void) acelerar {
    self.velocidadeAtual += (10.0 + (piloto.habilidade*0.1) + (motor.potencia*0.1));
    if(velocidadeAtual > velocidadeMaxima) {
        velocidadeMaxima = velocidadeAtual;
    }
}
@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        CarroCorrida *carro1 = [[CarroCorrida alloc] initWithVelocidade:150.0];
        [carro1 acelerar];
        printf("Velocidade atual: %.2f\n", carro1.velocidadeAtual);
    }
    return 0;
}
