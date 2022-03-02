package com.lnt;
//here i ll select the test cases to run

//import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
//import org.junit.runner.RunWith;

//@RunWith(JUnitPlatform.class)
@IncludeTags("PROD")
@SelectPackages("com.lnt")
public class TestSuite {

}
