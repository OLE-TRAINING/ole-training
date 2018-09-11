//
//  Piloto.h
//  Exercicio3-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef Piloto_h
#define Piloto_h

@interface Piloto : NSObject {
    char* nome;
    int habilidade;
    int idade;
}
@property(nonatomic, readwrite) int habilidade;
@end

#endif /* Piloto_h */
