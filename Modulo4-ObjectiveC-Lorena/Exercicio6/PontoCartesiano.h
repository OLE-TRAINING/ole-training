//
//  PontoCartesiano.h
//  Exercicio6-C
//
//  Created by Lorena Rodrigues Bruno on 10/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#ifndef PontoCartesiano_h
#define PontoCartesiano_h

@interface PontoCartesiano: NSObject {
    int pontoX;
    int pontoY;
}
@property(nonatomic, readwrite) int pontoX;
@property(nonatomic, readwrite) int pontoY;

@end

#endif /* PontoCartesiano_h */
