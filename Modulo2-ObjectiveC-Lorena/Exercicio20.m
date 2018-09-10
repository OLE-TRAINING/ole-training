//
//  main.m
//  Exercicio20-C
//
//  Created by Lorena Rodrigues Bruno on 06/09/2018.
//  Copyright © 2018 Lorena Rodrigues Bruno. All rights reserved.
//

#import <Foundation/Foundation.h>

void figura1() {
    int i, j;
    for(i=0; i<8; i++) {
        for(j=0; j<8; j++) {
            if (j <= i) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}

void figura2() {
    int i, j;
    for(i=8; i>0; i--) {
        for(j=0; j<8; j++) {
            if (j < i) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}

void figura3() {
    int i, j;
    for(i=0; i<8; i++) {
        for(j=0; j<8; j++) {
            if (j >= i) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}

void figura4() {
    int i, j;
    for(i=8; i>0; i--) {
        for(j=0; j<=8; j++) {
            if (j >= i) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        figura1();
        printf("\n");
        figura2();
        printf("\n");
        figura3();
        printf("\n");
        figura4();
        printf("\n");

    }
    return 0;
}
