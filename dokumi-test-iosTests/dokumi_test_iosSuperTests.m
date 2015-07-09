//
//  dokumi_test_iosTests.m
//  dokumi-test-iosTests
//
//  Created by Vincent Isambart on 7/9/15.
//  Copyright (c) 2015 Cookpad Inc. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <XCTest/XCTest.h>

@interface dokumi_test_iosSuperTests : XCTestCase

@end

@implementation dokumi_test_iosSuperTests

- (void)setUp {
    [super setUp];
    // Put setup code here. This method is called before the invocation of each test method in the class.
}

- (void)tearDown {
    // Put teardown code here. This method is called after the invocation of each test method in the class.
    [super tearDown];
}

- (void)testAnotherExample {
    XCTAssert(NO, @"FAIL"); // failing test
}

- (void)testExample {
    // This is an example of a functional test case.
    XCTAssert(YES, @"Pass");
}

- (void)testPerformanceExample {
    // This is an example of a performance test case.
    [self measureBlock:^{
        // Put the code you want to measure the time of here.
    }];
}

@end
