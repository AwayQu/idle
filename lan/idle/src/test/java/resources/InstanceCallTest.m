//
// Created by Away on 14/09/2017.
// Copyright (c) 2017 LarsChen. All rights reserved.
//

#import "InstanceCallTest.h"


@implementation InstanceCallTest {

}

- (void)caller {
    [self callee1];
    [self callee2];
}


- (void)callee1 {

}

- (void)callee2 {

}


@end