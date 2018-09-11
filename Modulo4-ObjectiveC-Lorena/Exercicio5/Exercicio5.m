//
//  main.m
//  Exercicio5-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "PontoCartesiano.h"

@implementation PontoCartesiano
@synthesize pontoX, pontoY;
-(id)initPonto:(int)pontoX Segundo:(int)pontoY {
    self = [super init];
    self.pontoX = pontoX;
    self.pontoY = pontoY;
    return self;
}

@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        PontoCartesiano *ponto = [[PontoCartesiano alloc] initPonto:15 Segundo:10];
        printf("Ponto cartesiano: (%i, %i)\n", [ponto pontoX], [ponto pontoY]);
    }
    return 0;
}

