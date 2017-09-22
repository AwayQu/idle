/*
 * Copyright (c) 2015 - present Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

//
//  AppDelegate.h
//  HelloWorldApp
//

#import <UIKit/UIKit.h>
@class Child;
@interface Parent : NSObject {
@public
    Child *child; // Instance variables are implicitly __strong
}
@end
@interface Child : NSObject {
@public
    Parent *parent;
}
@end
@interface AppDelegate : UIResponder<UIApplicationDelegate>

@property(strong, nonatomic) UIWindow* window;

@end
