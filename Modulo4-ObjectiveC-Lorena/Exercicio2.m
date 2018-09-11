//
//  main.m
//  Exercicio2-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Motor : NSObject {
    int potencia;
}
@property(nonatomic, readwrite) int potencia;
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

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        Motor *motor1 = [[Motor alloc]initWithPotencia:-50];
        printf("Potencia do motor 1: %i\n", motor1.potencia);
        
        Motor *motor2 = [[Motor alloc]initWithPotencia:60];
        printf("Potencia do motor 2: %i\n", motor2.potencia);
        
        Motor *motor3 = [[Motor alloc]initWithPotencia:130];
        printf("Potencia do motor 3: %i\n", motor3.potencia);
        
    }
    return 0;
}
