//
//  CustomModule.m
//  reactNativePlayground
//
//  Created by Ryan Atkinson on 8/10/18.
//  Copyright © 2018 Facebook. All rights reserved.
//

#import "CustomModule.h"
#import <UIKit/UIKit.h>

@implementation CustomModule

//export the name of the native module as 'Device' since no explicit name is mentioned
RCT_EXPORT_MODULE();

//exports a method getDeviceName to javascript
RCT_EXPORT_METHOD(getDeviceName:(RCTResponseSenderBlock)callback){
  @try{
    NSString *deviceName = [[UIDevice currentDevice] name];
    callback(@[[NSNull null], deviceName]);
  }
  @catch(NSException *exception){
    callback(@[exception.reason, [NSNull null]]);
  }
}

@end
